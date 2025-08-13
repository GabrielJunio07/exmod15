package dominio;

public class Esportivo extends Carro {
    public Esportivo(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void acelerar() {
        System.out.println(getMarca() + " " + getModelo() + " acelerando a 300 km/h!");
    }
}

