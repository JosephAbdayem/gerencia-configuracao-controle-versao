package model.conta;

public class ContaSalario extends ContaComum {

    private Long NroConta;
    private String DtAbertura;
    private String DtEncerramento;
    private int Situacao;
    private int Senha;
    private double Saldo;

    public ContaSalario() {
    }

    public ContaSalario(Long nroConta, String dtAbertura, String dtEncerramento, int situacao, int senha, double saldo) {
        NroConta = nroConta;
        DtAbertura = dtAbertura;
        DtEncerramento = dtEncerramento;
        Situacao = situacao;
        Senha = senha;
        Saldo = saldo;
    }

    public Long getNroConta() {
        return NroConta;
    }

    public void setNroConta(Long nroConta) {
        NroConta = nroConta;
    }

    public String getDtAbertura() {
        return DtAbertura;
    }

    public void setDtAbertura(String dtAbertura) {
        DtAbertura = dtAbertura;
    }

    public String getDtEncerramento() {
        return DtEncerramento;
    }

    public void setDtEncerramento(String dtEncerramento) {
        DtEncerramento = dtEncerramento;
    }

    public int getSituacao() {
        return Situacao;
    }

    public void setSituacao(int situacao) {
        Situacao = situacao;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int senha) {
        Senha = senha;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "NroConta=" + NroConta +
                ", DtAbertura='" + DtAbertura + '\'' +
                ", DtEncerramento='" + DtEncerramento + '\'' +
                ", Situacao=" + Situacao +
                ", Senha=" + Senha +
                ", Saldo=" + Saldo +
                '}';
    }
}
