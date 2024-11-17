package exercicio12;

public class Main {
    public static void main(String[] args) {

    TelefoneCelular celular = new TelefoneCelular("Xiaomi", "Redmi 9T", "Preto", 48, 128);

        System.out.println("Celular 1");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Câmera: " + celular.getCamera() + "mp");
        System.out.println("Armazenamento: " + celular.getArmazenamento() + "gb");

    }
}
