package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
//        !
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida");
        }
        System.out.println("Fora do if");
    }
}
