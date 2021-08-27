package pojos;

import java.util.Date;

public class Compra {
    private Proveedores proveedores;
    private Productos prodcutos;
    private Date fecha;
    private int cantidad;

    public Compra(Proveedores proveedores, Productos prodcutos, Date fecha, int cantidad) {
        this.setProveedores(proveedores);
        this.setProdcutos(prodcutos);
        this.setFecha(fecha);
        this.setCantidad(cantidad);
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public Productos getProdcutos() {
        return prodcutos;
    }

    public void setProdcutos(Productos prodcutos) {
        this.prodcutos = prodcutos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
