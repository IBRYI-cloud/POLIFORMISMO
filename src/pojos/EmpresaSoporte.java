package pojos;

import java.util.Date;

public class EmpresaSoporte {
    private Empresa empresa;
    private ProductosAltatecnologia producto;
    private double precio;
    public EmpresaSoporte(Empresa empresa, ProductosAltatecnologia producto, double precio){
        this.empresa = empresa;
        this.producto = producto;
        this.precio = precio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ProductosAltatecnologia getProducto() {
        return producto;
    }

    public void setProducto(ProductosAltatecnologia producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}