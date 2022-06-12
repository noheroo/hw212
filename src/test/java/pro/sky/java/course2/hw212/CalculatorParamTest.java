package pro.sky.java.course2.hw212;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.hw212.services.CalcServiceImpl;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParamTest {

    private final CalcServiceImpl out = new CalcServiceImpl();

    private static final int num1 = generateRandom();
    private static final int num2 = generateRandom();
    private static final int sum = num1+num2;
    private static final int sub = num1-num2;
    private static final int mul = num1*num2;
    private static final float div = (float) num1/num2;

    public static Stream<Arguments> paramsForCalculator() {
        return Stream.of(
                Arguments.of(num1, num2, sum),
                Arguments.of(num1, num2, sub),
                Arguments.of(num1, num2, mul),
                Arguments.of(num1, num2, div)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculator")
    public void sumTest() {
        float result = out.plus(num1, num2);
        assertEquals(sum, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculator")
    public void subtractionTest() {
        float result = out.minus(num1, num2);
        assertEquals(sub, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculator")
    public void multiplyTest() {
        float result = out.multiply(num1, num2);
        assertEquals(mul, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculator")
    public void divideTest() {
        float result = out.divide(num1, num2);
        assertEquals(div, result);
    }

    private static int generateRandom() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
