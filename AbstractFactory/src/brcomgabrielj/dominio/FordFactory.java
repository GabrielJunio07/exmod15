public class FordFactory implements CarFactory {
    public Car criarSedan() {
        return new FordSedan();
    }

    public Car criarSUV() {
        return new FordSUV();
    }
}
