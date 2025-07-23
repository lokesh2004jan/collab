package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/part2")
public class con2 {
    @GetMapping("/show")
    public String show2(){
        return "this show part 2 send to new branch";
    }
}
