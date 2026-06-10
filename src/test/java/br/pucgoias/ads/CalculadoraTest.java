package br.pucgoias.ads;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @ParameterizedTest
    @DisplayName("Deve somar numeros positivos, negativos e zero")
    @CsvSource({
        "2, 3, 5",
        "-2, -3, -5",
        "0, 8, 8",
        "-4, 10, 6"
    })
    void deveSomarDiferentesCenarios(double primeiroNumero, double segundoNumero, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.somar(primeiroNumero, segundoNumero), 0.0001);
    }

    @ParameterizedTest
    @DisplayName("Deve subtrair numeros positivos, negativos e zero")
    @CsvSource({
        "10, 4, 6",
        "-10, -4, -6",
        "0, 5, -5",
        "5, 0, 5"
    })
    void deveSubtrairDiferentesCenarios(double primeiroNumero, double segundoNumero, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.subtrair(primeiroNumero, segundoNumero), 0.0001);
    }

    @ParameterizedTest
    @DisplayName("Deve multiplicar numeros positivos, negativos e zero")
    @CsvSource({
        "4, 5, 20",
        "-4, 5, -20",
        "-4, -5, 20",
        "0, 99, 0"
    })
    void deveMultiplicarDiferentesCenarios(double primeiroNumero, double segundoNumero, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.multiplicar(primeiroNumero, segundoNumero), 0.0001);
    }

    @ParameterizedTest
    @DisplayName("Deve dividir numeros positivos e negativos")
    @CsvSource({
        "20, 4, 5",
        "-20, 4, -5",
        "-20, -4, 5",
        "0, 5, 0"
    })
    void deveDividirDiferentesCenarios(double dividendo, double divisor, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.dividir(dividendo, divisor), 0.0001);
    }

    @ParameterizedTest
    @DisplayName("Deve lancar excecao ao dividir por zero")
    @CsvSource({
        "10, 0",
        "-10, 0",
        "0, 0"
    })
    void deveLancarExcecaoAoDividirPorZero(double dividendo, double divisor) {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(dividendo, divisor));
    }
}
