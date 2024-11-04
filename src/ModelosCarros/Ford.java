package ModelosCarros;

public class Ford extends Carro {
    public Ford(String modelo) {
        super(modelo);
    }

    @Override
    public String getMarca() {
        return "Ford";
    }
}
