package review_oo.quizziz.questao_01;

public class Conta {

    public double saldo;

    public void depositar(double v) {
        saldo += v;
    }

    public boolean estornar(double v) {
        saldo -= v;
        return true;
    }
}