package review_oo.interfaces_vs_abstract;

public class CarroEletrico extends Veiculo implements Audivel, Eletrico {
    private int capacidadeBateria;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadeBateria) {
        super(marca, modelo, ano);
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro elétrico acelerando silenciosamente");
    }

    @Override
    public void frear() {
        System.out.println("Carro elétrico freando com regeneração de energia");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som artificial para segurança");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando bateria de " + capacidadeBateria + " kWh");
    }

    @Override
    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }
}
