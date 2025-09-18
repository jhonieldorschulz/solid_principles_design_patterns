package review_oo.interfaces_vs_abstract;

public class Carro extends Veiculo implements Audivel {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando carro normal");
    }

    @Override
    public void frear() {
        System.out.println("Freando carro normal");
    }

    public void emitirSom(){
        System.out.println("VRUM VRUMMM");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
