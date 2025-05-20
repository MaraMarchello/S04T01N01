package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/helloworld")
    public String hello(@RequestParam(name = "name", defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Maven project";
    }
    
    @GetMapping(value = {"/helloworld2", "/helloworld2/{name}"})
    public String hello2(@PathVariable(name = "name", required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hello, " + name + ". You are running a Maven project";
    }
} 