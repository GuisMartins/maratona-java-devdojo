package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parecela = 1  ; parecela < valorTotal; parecela++) {

            double valorParcela = valorTotal / parecela;

            if (valorParcela <1000){
                break;
            }
            System.out.printf("Parcela %d R$ %.2f'%n", parecela ,valorParcela);

        }
    }
}
