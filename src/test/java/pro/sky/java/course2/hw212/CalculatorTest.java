package pro.sky.java.course2.hw212;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.hw212.exceptions.DivideByZeroException;
import pro.sky.java.course2.hw212.services.CalcServiceImpl;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final CalcServiceImpl out = new CalcServiceImpl();

    int[] arr = generateRandomArray();

    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    @Test
    public void testPlus() {
        for (int i = 0; i < arr.length; i = i + 2) {
            int extend = out.plus(arr[i], arr[i + 1]);
            int actual = arr[i] + arr[i + 1];
            assertEquals(extend, actual);
        }
    }

    @Test
    public void testMinus() {
        for (int i = 0; i < arr.length; i = i + 2) {
            int extend = out.minus(arr[i], arr[i + 1]);
            int actual = arr[i] - arr[i + 1];
            assertEquals(extend, actual);
        }
    }

    @Test
    public void testMultiply() {
        for (int i = 0; i < arr.length; i = i + 2) {
            int extend = out.multiply(arr[i], arr[i + 1]);
            int actual = arr[i] * arr[i + 1];
            assertEquals(extend, actual);
        }
    }

    @Test
    public void testDivide() {
        for (int i = 0; i < arr.length; i = i + 2) {
            float extend = out.divide(arr[i], arr[i + 1]);
            float actual = (float) arr[i] / arr[i + 1];
            assertEquals(extend, actual);
        }
    }

    @Test
    public void testDivideByZeroException() {
        for (int i = 0; i < arr.length; i = i + 2) {
            int number = arr[i];
            assertThrows(DivideByZeroException.class, () -> out.divide(number, 0));
        }
    }
}
