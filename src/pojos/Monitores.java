package pojos;

import interfaces.IReseteable;

public class Monitores extends ProductosAlquiler implements IReseteable {
    private String resolucionMaxima;

    public Monitores(String codigo, String modelo, double precioxhora , String resolucionMaxima){
        super(codigo, modelo, precioxhora);
        this.resolucionMaxima = resolucionMaxima;
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitores{" +
                "resolucionMaxima='" + resolucionMaxima + '\'' +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void estado() {
        System.out.println("Brillo" + 50 + "%");
    }

    @java.lang.Override
    public void reset() {
        System.out.println("Reseteando Monitor....");

    }
}
