package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, folat, char, byte, short, long, boolean
        int age = 150;
        long numeroGrande = 100000000;
        double salarioDouble = 2000.34D;
        float salarioFloat = 2500.6F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String name = "Guilherme";

        System.out.println("A idade é " + age + " anos");
        System.out.println( name );
        System.out.println( falso );
        System.out.println( verdadeiro );
        System.out.println( caractere );
        System.out.println( idadeByte );
        System.out.println( idadeShort );
        System.out.println( salarioDouble );
        System.out.println( salarioFloat );
        System.out.println( numeroGrande );
        System.out.println();
        System.out.printf("");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Aula02TiposPrimitivos.main");
        System.out.println("name = " + name);

    }
}
