package pojos;

import interfaces.IReseteable;

public class DiscoDuro extends ProductosAlquiler implements IReseteable {
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

    @java.lang.Override
    public void reset() {
        System.out.println("Formateando discoduro...");
    }

    @Override
    public void estado() {
        System.out.println("Sectores defectuoso" + 142);

    }
}
