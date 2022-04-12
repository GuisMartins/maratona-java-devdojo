package academy.devdojo.maratonajava.introducao;

public class Aula05EstuturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 17;
        String categoria = "Categoria Adulto";

        if (idade < 15) {
            categoria = "Categoria Infatil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        }
        System.out.println(categoria);
    }
}
