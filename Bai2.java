package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;
import java.util.Scanner;

@RestController
public class Bai2 {
    @GetMapping("/bai2")
    Double Number() {
        double a = 2.5;
        double b = 5.2;
        double c = a* b;
        return  c;
    }
    public static void main(String[] args) {
        Bai2 b = new Bai2();
        b.Number();
    }
}
