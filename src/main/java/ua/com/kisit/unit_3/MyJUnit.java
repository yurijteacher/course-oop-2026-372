package ua.com.kisit.unit_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyJUnit {

    @Test
    public void test1(){

        int a = 3;
        int b = 5;
        assertEquals(8, a + b);
        
    }


}
