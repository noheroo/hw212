package pro.sky.java.course2.hw212.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.hw212.exceptions.DivideByZeroException;

@Service
public class CalcServiceImpl implements CalcService {

    public String hello() {
        return "Добро пожаловать в <b>Калькулятор</b>";
    }

    public int plus (int num1, int num2) {
        return num1 + num2;
    }

    public int minus (int num1, int num2) {
        return num1 - num2;
    }

    public int multiply (int num1, int num2) {
        return num1 * num2;
    }

    public float divide (int num1, int num2) {
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        return (float) num1 / num2;
    }
}

