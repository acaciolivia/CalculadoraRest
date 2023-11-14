package com.rest.calculadora.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity(name = "somar")
@Getter
@Setter
@ToString
public class Calculadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "num1")
    private double num1;

    @Column(name = "num2")
    private double num2;

    @Column(name ="operacao")
    private String operacao;

    @Column(name = "resultado")
    private double resultado;
}
