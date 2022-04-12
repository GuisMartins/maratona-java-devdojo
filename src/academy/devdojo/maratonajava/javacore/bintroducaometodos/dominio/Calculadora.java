package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 3);
    }

    public void mutiplicaDoisNumeros(int a, double b) {
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDivDoisNums(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 99;
        b = 32;
        System.out.println("Dentro do metodo");
        System.out.println(a);
        System.out.println(b);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
