import org.example.Kalkulator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KalkTest {
    Kalkulator kalk;
    @BeforeEach
    void setUp(){
        kalk = new Kalkulator();
    }
    @org.junit.jupiter.api.Test
    @DisplayName("Proste mnozenie powinno dzialac")
    void testMultiply(){
        assertEquals(20,kalk.multiply(4,5),"mnozenie powinno dzialac");
    }
    @RepeatedTest(5)
    @DisplayName("sprawdzanie mnozenia przez 0")
    void testZero(){
        assertEquals(0,kalk.multiply(0,5), "mnozenie przez 0 powinno wyniesc 0");
        assertEquals(0,kalk.multiply(5,0), "mnozenie przez 0 powinno wyniesc 0");
    }

}
