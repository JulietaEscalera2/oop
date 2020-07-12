package com.jalasoft.practice01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Julieta
 * @version 0.01
 */

@SpringBootApplication
public class Main {
 public static void main (String[] args){
     System.out.println("Hello");
     SpringApplication.run(Main.class, args);
 }
}
