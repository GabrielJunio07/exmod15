
public class FiatFactory implements CarFactory {
    public Car criarSedan() {
        return new FiatSedan();
    }

    public Car criarSUV() {
        return new FiatSUV();
    }
}
