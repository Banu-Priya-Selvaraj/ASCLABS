

package test.java.model;

import LAB1.AddOperations;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddOperationsTest {
    AddOperations addOperations = new AddOperations();

    // Test cases for add(int a, int b)
    @Test
    public void testAddTwoIntegers() {
        int result = addOperations.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testAddTwoIntegersZero() {
        int result = addOperations.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testAddTwoIntegersNegative() {
        int result = addOperations.add(-10, -20);
        assertEquals(-30, result);
    }

    @Test
    public void testAddTwoIntegersMaxValue() {
        int result = addOperations.add(Integer.MAX_VALUE, 1);
        assertTrue(result < 0); // Overflow condition
    }

    // Test cases for add(int a, int b, int c)
    @Test
    public void testAddThreeIntegers() {
        int result = addOperations.add(10, 20, 30);
        assertEquals(60, result);
    }

    @Test
    public void testAddThreeIntegersZero() {
        int result = addOperations.add(0, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testAddThreeIntegersNegative() {
        int result = addOperations.add(-10, -20, -30);
        assertEquals(-60, result);
    }

    @Test
    public void testAddThreeIntegersMaxValue() {
        int result = addOperations.add(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertTrue(result >0); // Overflow condition
    }

    // Test cases for add(double a, double b)
    @Test
    public void testAddTwoDoubles() {
        double result = addOperations.add(10.5, 20.1);
        assertEquals(30.6, result, 0.001);
    }

    @Test
    public void testAddTwoDoublesZero() {
        double result = addOperations.add(0.0, 0.0);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testAddTwoDoublesNegative() {
        double result = addOperations.add(-10.5, -20.1);
        assertEquals(-30.6, result, 0.001);
    }

    @Test
    public void testAddTwoDoublesSmallValues() {
        double result = addOperations.add(1e-10, 2e-10);
        assertEquals(3e-10, result, 1e-12);
    }

    @Test
    public void testAddTwoDoublesLargeValues() {
        double result = addOperations.add(1e308, 1e308);
        assertTrue(Double.isInfinite(result)); // Check for overflow to infinity
    }

    // Test cases for add(String a, int b)
    @Test
    public void testAddStringAndInteger() {
        String result = addOperations.add("Hello", 20);
        assertEquals("Hello 20", result);
    }

    @Test
    public void testAddEmptyStringAndInteger() {
        String result = addOperations.add("", 20);
        assertEquals(" 20", result);
    }

    @Test
    public void testAddStringAndLargeInteger() {
        String result = addOperations.add("Number", Integer.MAX_VALUE);
        assertEquals("Number " + Integer.MAX_VALUE, result);
    }

    @Test
    public void testAddNullStringAndInteger() {
        String result = addOperations.add(null,20);
        assertEquals("null 20", result);
    }
}
