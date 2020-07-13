package com.jalasoft.practice01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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

   // @PostMapping
    public String sayHello(@RequestParam (value = "name") String name,
                           @RequestParam(value = "lastName") String lastName){
        return "Hello "+ name + " " +lastName;
    }
    @PostMapping

    public String getFile(@RequestParam(value = "file")MultipartFile file) throws IOException {
        File destination = new File("C:\\Courses\\oop\\Documents");
        file.transferTo(destination);
        return "File: "+ file.getOriginalFilename();
    }


}
