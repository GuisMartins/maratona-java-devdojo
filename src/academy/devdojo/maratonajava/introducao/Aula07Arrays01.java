package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Nome 1";
        nomes[1] = "Nome 2";
        nomes[2] = "Nome 3";
        nomes[3] = "Nome 4";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
