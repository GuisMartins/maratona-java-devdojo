package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] arrayInt1 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int[] arrayBase : arrayInt1) {
            for (int num : arrayBase) {
                System.out.print(num + "| ");
            }
            System.out.println("\n--------");
        }
        int[] arrayA = {0, 0};
        int[] arrayB = {1, 2, 2, 3, 1};
        int[] arrayC = {1, 2, 2, 3, 5, 2, 3, 6};

        int[][] arrayInt2 = {arrayA, arrayB, arrayC};

        for (int[] arrayBase : arrayInt2) {
            for (int num : arrayBase) {
                System.out.print(num + "| ");
            }
            System.out.println("\n----------------------------");
        }
    }
}
