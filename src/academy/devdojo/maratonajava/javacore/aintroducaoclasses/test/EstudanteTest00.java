package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Estutante;

public class EstudanteTest00 {
    public static void main(String[] args) {
        Estutante estutante = new Estutante();
        estutante.nome = "Guilherme";
        estutante.idade = 29;
        estutante.sexo = 'M';

        System.out.println(estutante.nome);
        System.out.println(estutante.idade);
        System.out.println(estutante.sexo);
    }
}
