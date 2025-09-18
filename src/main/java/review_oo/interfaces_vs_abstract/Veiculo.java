package review_oo.interfaces_vs_abstract;

// Classe abstrata representando um veículo genérico
public abstract class Veiculo {
    private String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void acelerar();
    public abstract void frear();
}