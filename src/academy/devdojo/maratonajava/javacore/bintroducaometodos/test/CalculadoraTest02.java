package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora =new Calculadora();
        double result = calculadora.divideDoisNumeros(20,3);
        System.out.printf("%.2f", result);
    }
}
