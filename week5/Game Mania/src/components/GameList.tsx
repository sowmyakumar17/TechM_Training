import { Box, Button, Grid, Image, Text, VStack } from "@chakra-ui/react";
import { useEffect, useState } from "react";
import axios from "axios";

const API_KEY = "45638c85529c4dc88322167ed5c76e30";
const PAGE_SIZE = 6; 
const MAX_PAGES = 3; 

interface Game {
id: number;
name: string;
background_image: string;
}

interface GameListProps {
selectedGenre: string | null;
}

const GameList = ({ selectedGenre }: GameListProps) => {
const [games, setGames] = useState<Game[]>([]);
const [page, setPage] = useState(1);
const [totalPages, setTotalPages] = useState(1);

useEffect(() => {
const genreFilter = selectedGenre ? `&genres=${selectedGenre}` : "";
axios
    .get(`https://api.rawg.io/api/games?key=${API_KEY}&page=${page}&page_size=${PAGE_SIZE}${genreFilter}`)
    .then((response) => {
    setGames(response.data.results);
    const calculatedPages = Math.ceil(response.data.count / PAGE_SIZE);
    setTotalPages(Math.min(calculatedPages, MAX_PAGES)); 
    })
    .catch((error) => console.error("Error fetching games:", error));
}, [selectedGenre, page]);

return (
<VStack spacing={4} bgColor="red.400">
    <Grid templateColumns="repeat(auto-fit, minmax(200px, 1fr))" gap={4} >
    {games.map((game) => (
        <Box key={game.id} bg="gray.400" borderRadius="md" boxShadow="md" p={3} textAlign="center">
        <Image src={game.background_image} alt={game.name} borderRadius="md" />
        <Text mt={2} fontWeight="bold" fontSize="lg">
            {game.name}
        </Text>
        </Box>
    ))}
    </Grid>
    
    <Box mt={4}>
    <Button isDisabled={page <= 1} onClick={() => setPage((prev) => prev - 1)} colorScheme="blue" mr={2}>
        Previous
    </Button>
    <Text display="inline" fontSize="lg" fontWeight="bold">
        Page {page} of {totalPages}
    </Text>
    <Button isDisabled={page >= totalPages} onClick={() => setPage((prev) => prev + 1)} colorScheme="blue" ml={2}>
        Next
    </Button>
    </Box>
</VStack>
);
};

export default GameList;
