package pojos;

public class Clientes {
    private String Dni;
    private int Telefono;
    private String Domicilio;

    public Clientes(String dni, int telefono, String domicilio) {
        Dni = dni;
        Telefono = telefono;
        Domicilio = domicilio;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }
}
