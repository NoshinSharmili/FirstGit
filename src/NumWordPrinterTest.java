import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumWordPrinterTest {

    NumWordPrinter printer = new NumWordPrinter();

    @Test
    public void testEven() {
        assertEquals("Even", printer.printWord(4, false));
    }

    @Test
    public void testPrimeEleven() {
        assertEquals("PrimeEleven", printer.printWord(11, false));
    }

    @Test
    public void testLuckyThirteen() {
        assertEquals("LuckyThirteen", printer.printWord(13, false));
    }

    @Test
    public void testEvenPrimeEleven() {
        assertEquals("EvenPrimeEleven", printer.printWord(22, false));
    }

    @Test
    public void testEvenPrimeLucky() {
        assertEquals("EvenPrimeLucky", printer.printWord(286, false));
    }

    @Test
    public void testOddOneOut() {
        assertEquals("OddOneOut", printer.printWord(5, false));
    }

    @Test
    public void testUpperCaseOutput() {
        assertEquals("EVENPRIMEELEVEN", printer.printWord(22, true));
    }
}
