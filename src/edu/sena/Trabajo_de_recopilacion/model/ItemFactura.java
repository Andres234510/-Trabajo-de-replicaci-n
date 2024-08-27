package edu.sena.Trabajo_de_recopilacion.model;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    //CONSTRUCTOR
    public ItemFactura(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
