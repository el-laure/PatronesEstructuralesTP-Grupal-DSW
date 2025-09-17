package Facade;
import java.time.LocalDateTime;

public class Envio {
    public Carrito carrito;
    public String ubiEntrega;
    public LocalDateTime fechaHoraEntrega;

    public Envio(Carrito carrito, String ubi){
        this.carrito=carrito;
        this.ubiEntrega=ubi;
        this.fechaHoraEntrega=LocalDateTime.now().plusDays(3);
        System.out.println("Coordinando ubicación, fecha y hora de entrega de "+carrito.productos.size()+" productos...");
        System.out.println("Ubicación: "+ubiEntrega);
        System.out.println("Fecha y hora de entrega: "+fechaHoraEntrega);
    }
}
