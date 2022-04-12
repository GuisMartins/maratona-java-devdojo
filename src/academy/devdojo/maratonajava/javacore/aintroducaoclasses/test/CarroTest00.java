package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Carro;

public class CarroTest00 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Nome do Carro1";
        carro1.modelo = "Modelo Carro1";
        carro1.ano =1992;

        carro2.nome = "Nome do Carro2";
        carro2.modelo = "Modelo Carro2";
        carro2.ano =2000;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano + " ");
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano + " ");

    }
}
