package com.rest.calculadora.controller;

import com.rest.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    public double somar(@RequestParam double num1, @RequestParam double num2) {
        return service.somar(num1,num2);
    }
}
