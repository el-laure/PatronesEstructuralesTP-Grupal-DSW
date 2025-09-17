package Facade;

import java.util.ArrayList;

public class TiendaFacade {
    public void comprar(ArrayList<Producto> productos, String ubi){
        Carrito carrito = new Carrito();
        carrito.setProductos(productos);
        Pago pago = new Pago(carrito);
        Envio entrega = new Envio(carrito, ubi);
    }
}
