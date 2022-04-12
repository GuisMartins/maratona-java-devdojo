package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
         int num = 1;
         int num2 = 3;

         calculadora.alteraDoisNumeros(num,num2);
        System.out.println("Dentro da CalculadoraTest");
        System.out.println(num);
        System.out.println(num2);

    }
}
