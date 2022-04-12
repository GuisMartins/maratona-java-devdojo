package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais00 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 1;
        dias[0][1] = 2;

        dias[1][0] = 3;
        dias[1][1] = 4;

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
            System.out.println("================");
        }
    }
}
