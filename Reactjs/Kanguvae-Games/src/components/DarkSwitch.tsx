import { HStack, Switch, useColorMode } from "@chakra-ui/react";

function DarkSwitch() {
    let { colorMode, toggleColorMode } = useColorMode();
    return (
        <HStack justifyContent="flex-end" width="100%">
            <Switch 
                colorScheme="red"  
                isChecked={colorMode === "dark"} 
                onChange={toggleColorMode}
            >Theme</Switch>
        </HStack>
    );
}

export default DarkSwitch;
