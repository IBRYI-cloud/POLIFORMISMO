package pojos;

public class Proveedores {
    private String nif;
    private String direccion;

    public Proveedores(String nif, String direccion) {
        this.nif = nif;
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}