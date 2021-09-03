package pojos;

import interfaces.IReseteable;

import java.util.Date;

public class DiscoSolido extends ProductosAltatecnologia implements IReseteable {
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

    @java.lang.Override
    public void reset() {
        System.out.println("Formateando disco solido ...");
    }
}
