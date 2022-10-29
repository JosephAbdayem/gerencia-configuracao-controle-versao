package model;

public class Movimento {

    private int TipoMov;
    private String DtMov;
    private String HorMov;
    private double ValMov;

    public Movimento() {
    }

    public Movimento(int tipoMov, String dtMov, String horMov, double valMov) {
        TipoMov = tipoMov;
        DtMov = dtMov;
        HorMov = horMov;
        ValMov = valMov;
    }

    public int getTipoMov() {
        return TipoMov;
    }

    public void setTipoMov(int tipoMov) {
        TipoMov = tipoMov;
    }

    public String getDtMov() {
        return DtMov;
    }

    public void setDtMov(String dtMov) {
        DtMov = dtMov;
    }

    public String getHorMov() {
        return HorMov;
    }

    public void setHorMov(String horMov) {
        HorMov = horMov;
    }

    public double getValMov() {
        return ValMov;
    }

    public void setValMov(double valMov) {
        ValMov = valMov;
    }

    @Override
    public String toString() {
        return "Movimento{" +
                "TipoMov=" + TipoMov +
                ", DtMov='" + DtMov + '\'' +
                ", HorMov='" + HorMov + '\'' +
                ", ValMov=" + ValMov +
                '}';
    }
}
