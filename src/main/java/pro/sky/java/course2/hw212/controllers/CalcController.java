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
        return calcService.plus(num1,num2);
    }

    @GetMapping ( "/minus")
    public String minus(int num1, int num2) {
        return calcService.minus(num1,num2);
    }

    @GetMapping ( "/multiply")
    public String multiply(int num1, int num2) {
        return calcService.multiply(num1,num2);
    }

    @GetMapping ( "/divide")
    public String divide(int num1, int num2) {
        return calcService.divide(num1,num2);
    }
}
