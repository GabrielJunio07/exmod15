package dominio;

public class SUV extends Carro {
    public SUV(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void acelerar() {
        System.out.println(getMarca() + " " + getModelo() + " acelerando com força em terreno off-road!");
    }
}

