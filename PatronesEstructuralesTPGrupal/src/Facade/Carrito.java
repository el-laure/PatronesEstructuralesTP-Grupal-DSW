package Facade;
import java.util.ArrayList;

public class Carrito {
    public ArrayList<Producto>productos;

    public void setProductos(ArrayList<Producto> productos){
        this.productos=productos;
        System.out.println("Se han añadido "+productos.size()+ " producto/s al carrito.");
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }
}
