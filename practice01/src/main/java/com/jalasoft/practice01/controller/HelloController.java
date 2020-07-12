package com.jalasoft.practice01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Julieta
 * @version 0.01
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

   // @PostMapping
    public String sayHello(){
        return "Hello Julieta";
    }

    @PostMapping
    public String sayHello(@RequestParam (value = "name") String name,
                           @RequestParam(value = "lastName") String lastName){
        return "Hello "+ name + " " +lastName;
    }


}
