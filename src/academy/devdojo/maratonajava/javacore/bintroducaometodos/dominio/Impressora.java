package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Estutante;

public class Impressora {
    public void imprimeEstutante(Estutante estutante){
        System.out.println("-------------------------");
        System.out.println(estutante.nome);
        System.out.println(estutante.idade);
        System.out.println(estutante.sexo);
    }
}
