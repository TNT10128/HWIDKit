package xyz.playneptune.hwidkit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HwidKitTest {

    @Test 
    void hashesShouldBeEqual() {
        HwidKit hwidKit = new HwidKit();
        String helloWorld = "Hello World";
        String helloWorldHash = hwidKit.getMd5HashOfString(helloWorld);
        String helloWorldExpectedHash = "b10a8db164e0754105b7a99be72e3fe5";
        assertEquals(helloWorldExpectedHash, helloWorldHash);
    }

}
