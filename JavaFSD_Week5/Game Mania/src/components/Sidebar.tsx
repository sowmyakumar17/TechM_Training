import { VStack, Box, Heading } from "@chakra-ui/react";
import { useEffect, useState } from "react";
import axios from "axios";

const API_KEY = "45638c85529c4dc88322167ed5c76e30";

interface Genre {
id: number;
name: string;
}

interface SidebarProps {
onSelectGenre: (genre: string | null) => void;
}

const Sidebar = ({ onSelectGenre }: SidebarProps) => {
const [genres, setGenres] = useState<Genre[]>([]);

useEffect(() => {
axios
    .get(`https://api.rawg.io/api/genres?key=${API_KEY}`)
    .then((response) => setGenres(response.data.results.slice(0, 5))) 
    .catch((error) => console.error("Error fetching genres:", error));
}, []);

return (
<VStack spacing={3} align="stretch">
    <Heading size="md" textAlign="center">
    Categories
    </Heading>
    {genres.map((genre) => (
    <Box
        key={genre.id}
        p={3}
        bg="blue.400"
        color="white"
        borderRadius="md"
        textAlign="center"
        fontWeight="bold"
        cursor="pointer"
        transition="0.3s"
        _hover={{ bg: "blue.500", transform: "scale(1.05)" }}
        onClick={() => onSelectGenre(genre.name)}
    >
        {genre.name}
    </Box>
    ))}
</VStack>
);
};

export default Sidebar;
