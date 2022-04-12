package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parecela = (int) valorTotal; parecela >= 1; parecela--) {

            double valorParcela = valorTotal / parecela;

            if (valorParcela <1000){
                continue;
            }
            System.out.printf("Parcela %d R$ %.2f'%n", parecela ,valorParcela);

        }
    }
}
