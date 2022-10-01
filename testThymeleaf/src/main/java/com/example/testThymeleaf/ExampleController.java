package com.example.testThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping
    String getExp(Model model) {

        model.addAttribute("some", "This is coming from Controller");
        return "exp";
    }
}
