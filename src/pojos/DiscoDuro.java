package pojos;

public class DiscoDuro extends ProductosAlquiler {
    private int Capacidad;
    public DiscoDuro(String codigo, String modelo, double precioxhora, int capacidad){
        super(codigo, modelo, precioxhora);

        this.setCapacidad(capacidad);

    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }
}
