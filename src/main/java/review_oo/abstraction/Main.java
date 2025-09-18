package review_oo.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Circulo(10.0));
        formas.add(new Quadrado(5));


        double somatorioAreas = formas.stream().mapToDouble(FormaGeometrica::calcularArea).sum();
        System.out.println(somatorioAreas);
    }
}
