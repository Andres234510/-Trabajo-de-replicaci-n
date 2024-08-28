package edu.sena.Trabajo_de_recopilacion.model;

public class Producto {
    public static double precio;
    private int codigo;
    private String nombre;
    private static int ultimoCodigo;

    //COSTRUCTOR
    public Producto(String nombre, double precio){
        ultimoCodigo++;
        this.codigo = ultimoCodigo;
        this.nombre = nombre;
        Producto.precio = precio;
    }

    public Producto(){

    }

    //GETTER Y SETTER

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        Producto.precio = precio;
    }

    public static int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public static void setUltimoCodigo(int ultimoCodigo) {
        Producto.ultimoCodigo = ultimoCodigo;
    }

    @Override
    public String toString() {

        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }
}
