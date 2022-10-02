package com.example.testThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ExampleController {
    private List<Car> cars;
    Car car1 = new Car("BMW", "44$$");
    public ExampleController() {
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Fiat", "126p");
        Car car3 = new Car("Hynudai", "i30");
        Car car4 = new Car("Audi", "A8");
        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
    }

    @GetMapping("/exp")
    String getExp(Model model) {

        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());
        model.addAttribute("some", "This is coming from Controller");
        model.addAttribute("var1", "Hello World!");
        model.addAttribute("car", car1);
        return "exp";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car) {
        cars.add(car);
        return "redirect:/exp";
    }
}
