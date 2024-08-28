package edu.sena.Trabajo_de_recopilacion.model;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    //CONSTRUCTOR
    public ItemFactura(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;

    }

    // GETTERS Y SETTERS
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

    // metodo para calcular el importe de un producto.
    public double calcularImporte() {
        // operacion es catidad * precio que tiene el objeto producto

        double precio = Producto.precio;
        double operacion;
        operacion = cantidad * precio;

        return operacion;
    }

    // metodo para mostrar informacion del item registrado.
    @Override
    public String toString() {
        return producto +
                "\t" + cantidad +
                "\t" + calcularImporte();
    }

}
