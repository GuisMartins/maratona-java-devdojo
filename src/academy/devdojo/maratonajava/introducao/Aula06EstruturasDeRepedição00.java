package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepedição00 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            System.out.println("While " + ++count);
        }
        count = 0;
        do {
            System.out.println("Do " + ++count);
        } while ( count < 10);

        for (int i = 0; i < 10; i++){
            System.out.println("For " + i);
        }
    }
}
