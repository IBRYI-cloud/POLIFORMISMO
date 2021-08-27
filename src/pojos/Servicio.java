package pojos;

public class Servicio {
    private Clientes clientes;
    private Impresoras impresoras;
    private String detalles;
    private double totalFacturado;

    public Servicio(Clientes clientes, Impresoras impresoras, String detalles, double totalFacturado) {
        this.clientes = clientes;
        this.impresoras = impresoras;
        this.detalles = detalles;
        this.totalFacturado = totalFacturado;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Impresoras getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(Impresoras impresoras) {
        this.impresoras = impresoras;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(double totalFacturado) {
        this.totalFacturado = totalFacturado;
    }
}
