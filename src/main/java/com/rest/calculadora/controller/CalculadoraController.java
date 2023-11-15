package com.rest.calculadora.controller;

import com.rest.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @PostMapping("/somar")
    public double somar(@RequestParam double num1, @RequestParam double num2) {
        return service.somar(num1,num2);
    }

    @PostMapping("/subtrair")
    public double subtrair(@RequestParam double num1, @RequestParam double num2) {
        return service.subtrair(num1, num2);
    }

    @PostMapping("/multiplicar")
    public double multiplicar(@RequestParam double num1, @RequestParam double num2) {
        return service.multiplicar(num1, num2);
    }

    @PostMapping("/divir")
    public double dividir(@RequestParam double num1, @RequestParam double num2) {
        return service.divir(num1, num2);
    }
}
