package pojos;

import interfaces.IReseteable;

import java.util.Date;

public class Cpus extends ProductosAltatecnologia implements IReseteable {
    private int memoriaPrincipal;
    public Cpus(String codigo, String modelo, String PaisOrigen, Date FechaFabricacion, Empresa fabricante,  int memoriaPrincipal){
        super(codigo, modelo, PaisOrigen, FechaFabricacion, fabricante);
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "Cpus{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", PaisOrigen='" + PaisOrigen + '\'' +
                ", FechaFabricacion=" + FechaFabricacion +
                ", Fabricante=" + Fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void estado() {
        System.out.println("Años de uso:" + 12);
    }

    @java.lang.Override
    public void reset() {
        System.out.println("Reseteando a estado de fabrica...");
    }
}
