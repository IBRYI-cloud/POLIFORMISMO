package pojos;

import java.util.Date;

public class DiscoSolido extends ProductosAltatecnologia {
    private int capacidad;
    public DiscoSolido(String codigo, String modelo, String PaisOrigen, Date FechaFabricacion, Empresa fabricante, int capacidad){
    super(codigo, modelo, PaisOrigen, FechaFabricacion, fabricante);

    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
