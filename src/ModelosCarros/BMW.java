package ModelosCarros;

public class BMW extends Carro {
    public BMW(String modelo) {
        super(modelo);
    }

    @Override
    public String getMarca() {
        return "BMW";
    }
}
