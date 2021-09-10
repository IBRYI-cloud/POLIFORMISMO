import pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[]args){
        /*
        //productos
        Productos productos = new Productos("001", "teclado rgb");
        System.out.println(productos);
        //Alquiler
        ProductosAlquiler productosAlquiler = new ProductosAlquiler("004", "monitor 55", 55.5);
        System.out.println(productosAlquiler);
        //tecnologico
        Empresa empresa = new Empresa("SOBOCE", "AVENIDA 2" , 50);
        ProductosAltatecnologia productosAltatecnologia =  new ProductosAltatecnologia("0202" , "DW1" , "SIMON", Calendar.getInstance().getTime(), empresa);
        System.out.println(productosAltatecnologia);
        //MOnitor
        Monitores monitores = new Monitores("mss", "samsung", 22, "1280");
        System.out.println(monitores);
        //cpu
        Empresa toshiba = new Empresa("thosiba", "av blanco", 100);
        Cpus cpus = new Cpus("21323", "mss", "BOLIVIA", Calendar.getInstance().getTime(), toshiba, 160);
        System.out.println(cpus);
         */
        //polimorfismo
        //Productos productos = new Productos( "g12", "genius g120");

        //Productos lj750 = new Impresoras("lj750", "cANO 250", 30);
        //System.out.println(lj750);
        //Productos s200 = new Monitores("232+", "s32p", 55, "FULLHD");
        //System.out.println(s200);
        //Productos m500 = new DiscoDuro("20230", "mw211", 44 , 500);
        //System.out.println(m500);
        //Impresoras impresoras = (Impresoras) lj750;
        //System.out.println(impresoras);
        //Monitores monitores = (Monitores) s200;
        //System.out.println(monitores);
        //DiscoDuro discoDuro = (DiscoDuro) s200;
        //System.out.println(discoDuro);
        //Productos [] Productos = new  Productos[3];
        //Productos [0] = impresoras;
        //Productos [1] = monitores;
        //Productos [2] = discoDuro;
        //for (int i = 0; i < Productos.length; i++){
              //System.out.println(Productos[i]);
        }
        Monitores lg1010 = new Monitores("lg1010", "samsgung", 45, "HD");

    public Monitores getLg1010() {
        return lg1010;
    }
}
