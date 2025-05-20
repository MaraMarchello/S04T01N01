package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the HelloWorld API. Available endpoints:\n" +
               "- /HelloWorld\n" +
               "- /HelloWorld?Nombre=yourname\n" +
               "- /HelloWorld/2\n" +
               "- /HelloWorld/2/yourname";
    }
} 