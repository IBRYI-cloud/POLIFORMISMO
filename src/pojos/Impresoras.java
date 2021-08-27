package pojos;

public class Impresoras extends Productos {
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
}
