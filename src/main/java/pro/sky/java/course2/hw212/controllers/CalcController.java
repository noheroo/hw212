package pro.sky.java.course2.hw212.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hw212.services.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return calcService.hello();
    }

    @GetMapping ( "/plus")
    public String plus(int num1, int num2) {
        int result = calcService.plus(num1,num2);
        return generateFinalMessage(num1, num2, "+", result);
    }

    @GetMapping ( "/minus")
    public String minus(int num1, int num2) {
        int result = calcService.minus(num1,num2);
        return generateFinalMessage(num1, num2, "-", result);
    }

    @GetMapping ( "/multiply")
    public String multiply(int num1, int num2) {
        int result = calcService.multiply(num1,num2);
        return generateFinalMessage(num1, num2, "*", result);
    }

    @GetMapping ( "/divide")
    public String divide(int num1, int num2) {
        float result = calcService.divide(num1,num2);
        return generateFinalMessageForDivide(num1, num2, result);
    }

    private String generateFinalMessage(int num1, int num2, String action, int result) {
        return num1 + " " + action + " " + num2 + " = " + result;
    }

    private String generateFinalMessageForDivide(int num1, int num2, float result) {
        return num1 + " / " + num2 + " = " + result;
    }
}
