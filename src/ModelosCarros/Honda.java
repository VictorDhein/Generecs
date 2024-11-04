package ModelosCarros;

public class Honda extends Carro {
    public Honda(String modelo) {
        super(modelo);
    }

    @Override
    public String getMarca() {
        return "Honda";
    }
}
