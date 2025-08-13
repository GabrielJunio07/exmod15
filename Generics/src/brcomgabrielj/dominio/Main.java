package dominio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista com diferentes carros
        List<Carro> todosCarros = new ArrayList<>();
        todosCarros.add(new Sedan("Corolla", "Toyota"));
        todosCarros.add(new SUV("Compass", "Jeep"));
        todosCarros.add(new Esportivo("911 Turbo", "Porsche"));

        System.out.println("Todos os carros:");
        todosCarros.forEach(System.out::println);

        // Lista de esportivos
        List<Esportivo> esportivos = new ArrayList<>();
        esportivos.add(new Esportivo("Ferrari F8", "Ferrari"));
        esportivos.add(new Esportivo("Huracan", "Lamborghini"));

        // Chamando método genérico
        System.out.println("\nAcelerando apenas esportivos:");
        acelerarCarros(esportivos);
    }

    // Método genérico para qualquer lista que herde de Carro
    public static <T extends Carro> void acelerarCarros(List<T> lista) {
        lista.forEach(Carro::acelerar);
    }
}

