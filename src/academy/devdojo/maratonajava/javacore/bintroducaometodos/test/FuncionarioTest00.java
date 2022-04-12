package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest00 {
    public static void main(String[] args) {
        Funcionario funcinario = new Funcionario();
        double[] salarios = {2134, 4232, 5251};

        funcinario.nome = "Nome";
        funcinario.idade = 32;
//        funcinario.salarios = salarios;

        funcinario.imprime();

    }

}
