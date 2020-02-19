package pl.sdacademy.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/example1")
    public String example1(){
        return "ABC";
    }
    @GetMapping("/example2")
    public Car example2(){
        return new Car("fiat",123);
    }
}
