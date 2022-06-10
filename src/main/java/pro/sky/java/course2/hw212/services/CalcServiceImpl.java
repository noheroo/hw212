package pro.sky.java.course2.hw212.services;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String hello() {
        return "Добро пожаловать в <b>Калькулятор</b>";
    }

    public String plus (int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus (int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply (int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide (int num1, int num2) {
        if (num2 == 0) {
            return "Деление на 0 запрещено";
        }
        return num1 + " / " + num2 + " = " + ((float)num1 / num2);
    }
}
