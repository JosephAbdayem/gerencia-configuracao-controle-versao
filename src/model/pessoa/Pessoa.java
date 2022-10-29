package model.pessoa;

public class Pessoa {

    private String NomPessoa;
    private String EndPessoa;
    private Long CepPessoa;
    private String TelPessoa;
    private double RendaPessoa;
    private int SitPessoa;

    public Pessoa() {
    }

    public Pessoa(String nomPessoa, String endPessoa, Long cepPessoa, String telPessoa, double rendaPessoa, int sitPessoa) {
        NomPessoa = nomPessoa;
        EndPessoa = endPessoa;
        CepPessoa = cepPessoa;
        TelPessoa = telPessoa;
        RendaPessoa = rendaPessoa;
        SitPessoa = sitPessoa;
    }

    public String getNomPessoa() {
        return NomPessoa;
    }

    public void setNomPessoa(String nomPessoa) {
        NomPessoa = nomPessoa;
    }

    public String getEndPessoa() {
        return EndPessoa;
    }

    public void setEndPessoa(String endPessoa) {
        EndPessoa = endPessoa;
    }

    public Long getCepPessoa() {
        return CepPessoa;
    }

    public void setCepPessoa(Long cepPessoa) {
        CepPessoa = cepPessoa;
    }

    public String getTelPessoa() {
        return TelPessoa;
    }

    public void setTelPessoa(String telPessoa) {
        TelPessoa = telPessoa;
    }

    public double getRendaPessoa() {
        return RendaPessoa;
    }

    public void setRendaPessoa(double rendaPessoa) {
        RendaPessoa = rendaPessoa;
    }

    public int getSitPessoa() {
        return SitPessoa;
    }

    public void setSitPessoa(int sitPessoa) {
        SitPessoa = sitPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "NomPessoa='" + NomPessoa + '\'' +
                ", EndPessoa='" + EndPessoa + '\'' +
                ", CepPessoa=" + CepPessoa +
                ", TelPessoa='" + TelPessoa + '\'' +
                ", RendaPessoa=" + RendaPessoa +
                ", SitPessoa=" + SitPessoa +
                '}';
    }
}
