package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class Bai1 {
    @GetMapping("/bai1")
    Integer Number() {
        int a = 2, b = 3;
        return a+b;
    }
}
