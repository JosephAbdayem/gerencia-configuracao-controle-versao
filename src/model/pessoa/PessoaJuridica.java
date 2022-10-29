package model.pessoa;

public class PessoaJuridica extends Pessoa {

    private String CnpjPessoa;


    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpjPessoa) {
        CnpjPessoa = cnpjPessoa;
    }

    public String getCnpjPessoa() {
        return CnpjPessoa;
    }

    public void setCnpjPessoa(String cnpjPessoa) {
        CnpjPessoa = cnpjPessoa;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CnpjPessoa='" + CnpjPessoa + '\'' +
                '}';
    }
}
