package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest00 {
    public static void main(String[] args) {
        Calculadora caulculadora = new Calculadora();
        caulculadora.somaDoisNumeros();
        System.out.println("Fim Soma Dois Números");
        caulculadora.subtraiDoisNumeros();
        System.out.println("Fim Subtração Dois Números");

    }
}
