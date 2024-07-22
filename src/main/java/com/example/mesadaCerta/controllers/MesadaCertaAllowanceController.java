package com.example.mesadaCerta.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allowances")
public class MesadaCertaAllowanceController {
    @RequestMapping("/hello")
    String home() {
        return "Hello Allowances!";
    }
}
