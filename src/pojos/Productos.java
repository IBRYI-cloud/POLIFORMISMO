package pojos;

public abstract class Productos {
    protected String codigo;
    protected String modelo;

    public Productos(String codigo, String modelo) {
        this.codigo = codigo;
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
    public String modeloMayuscula(){ return modelo.toUpperCase(); }
    public abstract  void estado();
}
