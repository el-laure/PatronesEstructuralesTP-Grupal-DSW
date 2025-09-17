package Facade;

public class Pago {
    public double totalAbonado;
    public Carrito carrito;

    public Pago(Carrito carrito){
        this.carrito=carrito;
        System.out.println("Procesando el pago de "+carrito.getProductos().size()+" productos...");
        double total=0.0;
        for (Producto prod : carrito.getProductos()){
            total = total + prod.precioUnitario;
        }
        this.totalAbonado=total;
        System.out.println("Se ha efectuado el pago de los productos. Total abonado: $"+totalAbonado);
    }

}
