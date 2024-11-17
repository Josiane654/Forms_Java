package exercicio12;

public class TelefoneCelular {
    private String marca;
    private String modelo;
    private String cor;
    private float camera;
    private float armazenamento;

    public TelefoneCelular(String marca, String modelo, String cor, float camera, float armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.camera = camera;
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getCamera() {
        return camera;
    }
    public void setCamera(float camera) {
        this.camera = camera;
    }

    public float getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(float armazenamento) {
        this.armazenamento = armazenamento;
    }
}


