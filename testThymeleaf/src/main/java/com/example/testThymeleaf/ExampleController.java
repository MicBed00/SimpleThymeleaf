package com.example.testThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/")
    String getExp(Model model) {
        Car car1 = new Car("BMW", "i8");
        model.addAttribute("some", "This is coming from Controller");
        model.addAttribute("var1", "Hello World!");
        model.addAttribute("car", car1);
        return "exp";
    }
}
