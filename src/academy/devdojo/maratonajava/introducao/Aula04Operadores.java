package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
//        +-/*
        double num = 19;
        double num1 = 29;

        System.out.println(num + num1 + " valor da soma " + num + num1);
        System.out.println(num / num1);
        System.out.println(num * num1);
        System.out.println(num - num1);

//        %
        int resto = 21 % 7;
        System.out.println(resto);

//        < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

//        && || !
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMairQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPopanca = 21000;
        float valorTotalPlaystation = 5000f;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorTotalPlaystation || valorTotalContaPopanca > valorTotalPlaystation;

        System.out.println("isPlaystationCompravel " + isPlaystationCompravel);

//        = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus = 2; // 0

        System.out.println(bonus);

        int contador = 0;
        contador++; // contador = contador + 1;
        contador--; // contador = contador - 1;
        ++contador;
        --contador;
        int contador2 =0;

        System.out.println( contador2++);
        System.out.println( contador2);






    }
}
