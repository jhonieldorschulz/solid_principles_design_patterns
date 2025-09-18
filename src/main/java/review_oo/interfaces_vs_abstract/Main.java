package review_oo.interfaces_vs_abstract;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new CarroEletrico("BYD", "T-1000", 2025, 500));
        veiculos.add(new Carro("Toyota", "Corolla", 2025));
    }
}
