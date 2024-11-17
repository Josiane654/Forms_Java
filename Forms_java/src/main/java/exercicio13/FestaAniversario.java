package exercicio13;

public class FestaAniversario {
    private String aniversariante;
    private int idade;
    private int convidados;
    private String bolo;
    private int presentes;

    public FestaAniversario(String aniversariante, int idade, int convidados, String bolo, int presentes) {
        this.aniversariante = aniversariante;
        this.idade = idade;
        this.convidados = convidados;
        this.bolo = bolo;
        this.presentes = presentes;
    }

    public String getAniversariante() {
        return aniversariante;
    }
    public void setAniversariante(String aniversariante) {
        this.aniversariante = aniversariante;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getConvidados() {
        return convidados;
    }
    public void setConvidados(int convidados) {
        this.convidados = convidados;
    }

    public String getBolo() {
        return bolo;
    }
    public void setBolo(String bolo) {
        this.bolo = bolo;
    }

    public int getPresentes() {
        return presentes;
    }
    public void setPresentes(int presentes) {
        this.presentes = presentes;
    }
}
