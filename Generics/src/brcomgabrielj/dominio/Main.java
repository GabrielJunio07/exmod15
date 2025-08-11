package dominio;

public class Main {
    public static void main(String[] args) {
        // Criando um carro com infoExtra sendo um Integer (ano)
        Carro<Integer> carro1 = new Carro<>("Civic", "Honda", 2020);
        carro1.exibirInfo();

        System.out.println();

        // Criando um carro com infoExtra sendo um Double (preço)
        Carro<Double> carro2 = new Carro<>("Corolla", "Toyota", 125000.50);
        carro2.exibirInfo();

        System.out.println();

        // Criando um carro com infoExtra sendo uma String (cor)
        Carro<String> carro3 = new Carro<>("Mustang", "Ford", "Vermelho");
        carro3.exibirInfo();
    }
}
