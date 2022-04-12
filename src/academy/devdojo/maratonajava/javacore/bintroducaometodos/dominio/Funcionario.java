package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("==================");

        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            System.out.println("Não há salario");

            return;
        }
        for (double temp : this.salarios) {
            System.out.println("R$ " + temp);
        }
        mediaFuncionario();

    }

    public void mediaFuncionario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double temp : salarios) {
            media = +temp;
        }
        media /= salarios.length;
        System.out.printf("\n%.2f", media);
    }
}
