package ModelosCarros;

public class Audi extends Carro {
    public Audi(String modelo) {
        super(modelo);
    }

    @Override
    public String getMarca() {
        return "Audi";
    }
}
