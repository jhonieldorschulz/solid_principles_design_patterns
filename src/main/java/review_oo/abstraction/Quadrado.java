package review_oo.abstraction;

public class Quadrado implements FormaGeometrica {

    private double lado;


    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado,2);
    }

    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
