package com.rest.calculadora.enums;

public enum TipoOperacao {

    ADICAO("A"),
    SUBTRACAO("S"),
    MULTIPLICACAO("M"),
    DIVISAO("D");

    private final String simbolo;

    TipoOperacao(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
