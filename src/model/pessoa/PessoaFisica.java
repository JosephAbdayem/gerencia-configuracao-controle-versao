package model.pessoa;

public class PessoaFisica extends Pessoa {

    private String CpfPessoa;
    private String RgPessoa;


    public PessoaFisica() {
    }

    public PessoaFisica(String cpfPessoa, String rgPessoa) {
        CpfPessoa = cpfPessoa;
        RgPessoa = rgPessoa;
    }

    public String getCpfPessoa() {
        return CpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        CpfPessoa = cpfPessoa;
    }

    public String getRgPessoa() {
        return RgPessoa;
    }

    public void setRgPessoa(String rgPessoa) {
        RgPessoa = rgPessoa;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CpfPessoa='" + CpfPessoa + '\'' +
                ", RgPessoa='" + RgPessoa + '\'' +
                '}';
    }
}
