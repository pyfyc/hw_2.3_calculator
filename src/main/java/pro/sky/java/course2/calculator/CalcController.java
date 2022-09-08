package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(path = "/plus")
    public String printSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.printSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String printDifference(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.printDifference(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String printMultiplicationResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.printMultiplicationResult(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String printDivisionResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.printDivisionResult(num1, num2);
    }
}
