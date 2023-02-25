package com.example.demo;

import com.azure.core.annotation.Get;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    String get(){
        return "Server is runnig From Git <h1>Hi Tester</h1>";
    }
}
