package model.conta;

public class ContaEspecial extends ContaComum {

    private double LimiteConta;

    public ContaEspecial() {
    }

    public ContaEspecial(double limiteConta) {
        LimiteConta = limiteConta;
    }

    public double getLimiteConta() {
        return LimiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        LimiteConta = limiteConta;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "LimiteConta=" + LimiteConta +
                '}';
    }
}
