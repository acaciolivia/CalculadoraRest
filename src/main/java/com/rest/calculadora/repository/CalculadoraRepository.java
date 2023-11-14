package com.rest.calculadora.repository;

import com.rest.calculadora.model.Calculadora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculadoraRepository extends JpaRepository<Calculadora,Long> {
}
