package pojos;

public class Monitores extends ProductosAlquiler {
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
}
