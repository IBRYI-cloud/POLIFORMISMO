package pojos;

public abstract class ProductosAlquiler extends Productos{
    private double precioxhora;
    public ProductosAlquiler(String codigo, String modelo, double precioxhora){
        super(codigo, modelo);
        this.precioxhora = precioxhora;

    }

    public double getPrecioxhora() {
        return precioxhora;
    }

    public void setPrecioxhora(double precioxhora) {
        this.precioxhora = precioxhora;
    }

    @Override
    public String toString() {
        return "ProductosAlquiler{" +
                "precioxhora=" + precioxhora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}