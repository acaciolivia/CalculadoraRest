package com.rest.calculadora.service;

import com.rest.calculadora.enums.TipoOperacao;
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

    private TipoOperacao operacao;

   public double somar(double num1, double num2) {
       double resultado = num1 + num2;
       salvarResultado(num1, num2, operacao.ADICAO, resultado);

       return resultado;
   }


   public double subtrair(double num1, double num2) {
       double resultado = num1 - num2;
       salvarResultado(num1, num2, operacao.SUBTRACAO, resultado);

       return resultado;
   }

   public double multiplicar(double num1, double num2) {
       double resultado = num1 * num2;
       salvarResultado(num1, num2, operacao.MULTIPLICACAO, resultado);

       return resultado;
   }

   public double divir(double num1, double num2) {
       if(num2 == 0) {
           throw new IllegalArgumentException("Não é possível dividir por zero");
       }
       double resultado = num1 / num2;
       salvarResultado(num1, num2, operacao.DIVISAO, resultado);

       return resultado;
   }

   public List<Calculadora> findAll() {
       return repository.findAll();
   }

   private void salvarResultado(double num1, double num2, TipoOperacao operacao, double resultado){
       Calculadora calc = new Calculadora();

       calc.setNum1(num1);
       calc.setNum2(num2);
       calc.setOperacao(operacao);
       calc.setResultado(resultado);
       repository.save(calc);
    }

}
