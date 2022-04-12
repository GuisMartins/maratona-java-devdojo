package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        int nInicial = 0;
        int nFinal = 1000000;

        for ( ;nInicial <= nFinal; nInicial++) {
            if (nInicial % 2 == 0) {
                System.out.println(nInicial);
            }
        }
    }
}
