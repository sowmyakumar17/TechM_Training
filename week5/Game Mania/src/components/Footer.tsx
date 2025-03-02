import { Center , Text} from "@chakra-ui/react";

function Footer() {
return (
    <Center bg="teal.500" p={4} borderRadius="md">
    <Text fontSize="sm" color="white">
        © {new Date().getFullYear()} GAME MANIA. All rights reserved.
    </Text>
    </Center>
);
}
export default Footer;