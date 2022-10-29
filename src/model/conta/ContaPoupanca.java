package model.conta;

public class ContaPoupanca extends ContaComum {

    private double DtAniversario;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double dtAniversario) {
        DtAniversario = dtAniversario;
    }

    public double getDtAniversario() {
        return DtAniversario;
    }

    public void setDtAniversario(double dtAniversario) {
        DtAniversario = dtAniversario;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "DtAniversario=" + DtAniversario +
                '}';
    }
}
