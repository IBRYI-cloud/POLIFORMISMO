package pojos;

import java.util.Date;

public class Venta {
    private Clientes clientes;
    private Impresoras impresoras;
    private Date fecha;

    public Venta(Clientes clientes, Impresoras impresoras, Date fecha) {
        this.clientes = clientes;
        this.impresoras = impresoras;
        this.fecha = fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
