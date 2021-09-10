package pojos;

import interfaces.IReseteable;

public class Impresoras extends Productos implements IReseteable {
    private int Velocidad;
    public Impresoras(String codigo, String modelo, int Velocidad){
        super(codigo, modelo);
        this.Velocidad = Velocidad;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int velocidad) {
        Velocidad = velocidad;
    }

    @Override
    public void estado() {
        System.out.println("PAGINA IMPRESAS" +   152400);
    }



    @java.lang.Override
    public void reset() {
        System.out.println("Reseteando Impresora...");

    }


}
