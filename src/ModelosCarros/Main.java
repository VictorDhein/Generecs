package ModelosCarros;

public class Main {
    public static void main(String[] args) {
        ListaDeCarros<Carro> lista = new ListaDeCarros<>();

        lista.adicionarCarro(new Honda("Civic"));
        lista.adicionarCarro(new Toyota("Corolla"));
        lista.adicionarCarro(new Audi("A3"));
        lista.adicionarCarro(new BMW("120i"));
        lista.adicionarCarro(new Ford("Fusion"));

        lista.listarCarros();
    }
}
