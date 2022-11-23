package principal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void first(){
        String result = HelloWorld.getName();
        Assertions.assertEquals("HelloWorld.class",result);
    }

}