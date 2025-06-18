public class FabricaDeCarros {
    public static void main(String[] args) {

        CarFactory fabrica = new FordFactory();

        Car sedan = fabrica.criarSedan();
        Car suv = fabrica.criarSUV();

        sedan.exibirInfo();
        suv.exibirInfo();
    }
}
