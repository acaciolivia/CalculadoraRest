package com.rest.calculadora.service;

import com.rest.calculadora.model.Calculadora;
import com.rest.calculadora.repository.CalculadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculadoraService {

    @Autowired
    private CalculadoraRepository repository;

    private Calculadora calculadora;

   public double somar(double num1, double num2) {
       double resultado = num1 + num2;
       salvarResultado(num1, num2, "+", resultado);

       return resultado;
   }


   public double subtrair(double num1, double num2) {
       double resultado = num1 - num2;
       salvarResultado(num1, num2, "-", resultado);

       return resultado;
   }

   public void salvarResultado(double num1, double num2, String operacao, double resultado){
       Calculadora calc = new Calculadora();

       calc.setNum1(num1);
       calc.setNum2(num2);
       calc.setOperacao(operacao);
       calc.setResultado(resultado);
       repository.save(calc);
    }

}
