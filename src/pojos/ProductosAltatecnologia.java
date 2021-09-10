package pojos;

import java.util.Date;

public class ProductosAltatecnologia extends Productos {
    protected String PaisOrigen;
    protected Date FechaFabricacion;
    protected Empresa Fabricante;

    public ProductosAltatecnologia(String codigo, String modelo, String paisOrigen, Date FechaFabricacion, Empresa fabricante ){
        super(codigo, modelo);
        this.setPaisOrigen(getPaisOrigen());
        this.FechaFabricacion = FechaFabricacion;
        this.Fabricante = fabricante;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }

    public Date getFechaFabricacion() {
        return FechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        FechaFabricacion = fechaFabricacion;
    }

    public Empresa getFabricante() {
        return Fabricante;
    }

    public void setFabricante(Empresa fabricante) {
        Fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "ProductosAltatecnologia{" +
                "PaisOrigen='" + PaisOrigen + '\'' +
                ", FechaFabricacion=" + FechaFabricacion +
                ", Fabricante=" + Fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void estado() {
        System.out.println();
    }
}