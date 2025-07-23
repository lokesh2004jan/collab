package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class controller {
   @GetMapping("/greet")
    public String greet(){
        return "welcome to all developers";
    }
}
