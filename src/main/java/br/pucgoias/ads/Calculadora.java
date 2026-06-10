package br.pucgoias.ads;

public class Calculadora {

    public double somar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public double subtrair(double primeiroNumero, double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    public double multiplicar(double primeiroNumero, double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    public double dividir(double dividendo, double divisor) {
        if (divisor == 0.0) {
            throw new ArithmeticException("Divisao por zero nao permitida.");
        }

        return dividendo / divisor;
    }
}
