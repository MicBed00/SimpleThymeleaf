package com.example.testThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ExampleController {

    @GetMapping("/car")
    String getExp(Model model) {
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Fiat", "126p");
        Car car3 = new Car("Hynudai", "i30");
        Car car4 = new Car("Audi", "A8");
        List<Car> cars = Arrays.asList(car1,car2,car3,car4);
        model.addAttribute("cars", cars);


        model.addAttribute("some", "This is coming from Controller");
        model.addAttribute("var1", "Hello World!");
        model.addAttribute("car", car1);
        return "exp";
    }
}
