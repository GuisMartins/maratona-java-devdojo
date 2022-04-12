package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Estutante;
import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Impressora;

public class EstudanteTest01 {
    public static void main(String[] args) {


        Estutante estutante1 = new Estutante();
        Estutante estutante2 = new Estutante();
        Impressora impressora = new Impressora();

        estutante1.nome = "Nome 1";
        estutante1.idade = 13;
        estutante1.sexo = 'F';

        estutante2.nome = "Nome 2";
        estutante2.idade = 12;
        estutante2.sexo = 'F';

        impressora.imprimeEstutante(estutante1);
        impressora.imprimeEstutante(estutante2);


    }
}