package br.pucgoias.ads;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraFuncionalTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Deve executar um fluxo completo com as quatro operacoes")
    void deveExecutarFluxoCompletoDeCalculo() {
        double soma = calculadora.somar(10, 5);
        double subtracao = calculadora.subtrair(soma, 3);
        double multiplicacao = calculadora.multiplicar(subtracao, 2);
        double divisao = calculadora.dividir(multiplicacao, 4);

        assertEquals(6.0, divisao, 0.0001);
    }
}
