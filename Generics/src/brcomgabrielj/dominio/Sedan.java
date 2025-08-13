package dominio;

public class Sedan extends Carro {
    public Sedan(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void acelerar() {
        System.out.println(getMarca() + " " + getModelo() + " acelerando suavemente...");
    }
}

