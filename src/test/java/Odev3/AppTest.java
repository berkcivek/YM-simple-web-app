/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Odev3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }



    @Test
    public void testNull(){
        
        java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
        assertNotNull(inputList);
    }
    /*
    @Test
    public void testTrue(){
       
        java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
        App.topla(inputList, 2, 2, 3);      
        assertTrue();
    }
    */
}
