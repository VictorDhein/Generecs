package ModelosCarros;

public class Toyota extends Carro {
    public Toyota(String modelo) {
        super(modelo);
    }

    @Override
    public String getMarca() {
        return "Toyota";
    }
}

