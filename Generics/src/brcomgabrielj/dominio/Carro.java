package dominio;

public class Carro<T> {
    private String modelo;
    private String marca;
    private T infoExtra;

    public Carro(String modelo, String marca, T infoExtra) {
        this.modelo = modelo;
        this.marca = marca;
        this.infoExtra = infoExtra;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Info extra: " + infoExtra);
    }
}
