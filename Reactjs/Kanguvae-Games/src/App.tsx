import { Grid, GridItem, Heading, Center } from "@chakra-ui/react";
import Sidebar from "./components/Sidebar";
import { useState } from "react";
import GameList from "./components/GameList";
import DarkSwitch from "./components/DarkSwitch";

function App() {
  const [selectedGenre, setSelectedGenre] = useState<string | null>(null);

  return (
    <>
      <Grid
        templateAreas={{
          base: `"nav" "main"`,
          md: `"nav nav" "side main"`
        }}
        templateColumns={{ base: "1fr", md: "250px 1fr" }}
        templateRows={{ base: "auto 1fr", md: "auto 1fr" }}
        gap={4}
        p={4}
      >
        <GridItem area={"nav"} bg={"teal.500"} p={4} borderRadius="md">
          <Center h="100%">
            <Heading
              size="xl"
              bgGradient="linear(to-r, pink.400, yellow.400, pink.400, yellow.400)"
              bgClip="text"
              fontWeight="extrabold"
            > 
            GAME MANIA
            </Heading>
            <DarkSwitch/>
          </Center>
        </GridItem>
        <GridItem area={"side"} bg={"yellow.300"} p={4} borderRadius="md" display={{ base: "none", md: "block" }}>
          <Sidebar onSelectGenre={setSelectedGenre} />
        </GridItem>

        <GridItem area={"main"} bg={"gray.100"} p={4} borderRadius="md">
          <GameList selectedGenre={selectedGenre} />
        </GridItem>
      </Grid>
    </>
  );
}

export default App;
