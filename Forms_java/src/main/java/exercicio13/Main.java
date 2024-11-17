package exercicio13;

public class Main {
    public static void main(String[] args) {
        FestaAniversario aniversario = new FestaAniversario("Josiane", 20, 50,"Chocolate", 15);

        System.out.println("Informações do aniversário:");
        System.out.println("Aniversariante: " + aniversario.getAniversariante());
        System.out.println("Idade do(a) aniversariante: " + aniversario.getIdade());
        System.out.println("Quantidade de convidados: " + aniversario.getConvidados());
        System.out.println("Sabor do bolo: " + aniversario.getBolo());
        System.out.println("Quantidade de presentes: " + aniversario.getPresentes());
    }
}
