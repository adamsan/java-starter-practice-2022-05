import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareNumbersTest {

    @Test
    void testRangeReturnsNormal() {
        int[] result = SquareNumbers.range(5, 10);
        int[] expected = {5, 6, 7, 8, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRangeWhenZeroLength() {
        int[] result = SquareNumbers.range(5, 5);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRangeWhenNegativeLength() {
        int[] result = SquareNumbers.range(25, 5);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    void testCalculationForPositiveInput() {
        int result = SquareNumbers.calculate(5);
        int expected = 25;
        assertEquals(expected, result);
    }

    @Test
    void testCalculationForNegativeInput() {
        int result = SquareNumbers.calculate(-5);
        int expected = 0;
        assertEquals(expected, result);
    }
}