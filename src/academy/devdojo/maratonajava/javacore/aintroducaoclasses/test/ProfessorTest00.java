package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Professor;

public class ProfessorTest00 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Professor";
        professor.idade = 120;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo + " ");
    }
}
