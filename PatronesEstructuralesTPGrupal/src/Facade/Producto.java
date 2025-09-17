package Facade;

public class Producto {
    private static int contador=0;
    public int idProducto;
    public String nomProducto;
    public double precioUnitario;

    public Producto(String nombre, double precio){
        contador++;
        this.idProducto=contador;
        this.nomProducto=nombre;
        this.precioUnitario=precio;
    }
}
