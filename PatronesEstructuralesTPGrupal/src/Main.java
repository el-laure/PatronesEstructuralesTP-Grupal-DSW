import Adapter.*;
import Bridge.*;
import Decorator.*;
import Facade.*;
import Proxy.*;
import Composite.*;
import Flyweight.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Prueba del ADAPTER ----------");
        ImpresoraPDF documento = new ImpresoraPDF();
        try {
            documento.imprimir("txt", "Como vender cursos");
            documento.imprimir("pdf", "Sears zemansky");
            documento.imprimir("png", "Imagen");
        } catch (NoSoportado e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("--------------------------------------");


        System.out.println("---------- Prueba del BRIDGE ----------");
        Notificacion alerta = new Alerta(new SMS());
        Notificacion recordatorio = new Recordatorio(new SMS());
        Notificacion promocion = new Promocion(new SMS());
        //
        Notificacion alerta2 = new Alerta(new Email());
        Notificacion recordatorio2 = new Recordatorio(new Email());
        Notificacion promocion2 = new Promocion(new Email());
        //
        alerta.notificar("Poca bateria");
        alerta2.notificar("Temblor en MENDOZA");
        recordatorio.notificar("Tomar agua");
        recordatorio2.notificar("Dormir temprano");
        promocion.notificar("Descuento en el supermercado");
        promocion2.notificar("Llevas 2 pagas 2");
        System.out.println("--------------------------------------");


        System.out.println("---------- Prueba del DECORATOR ----------");
        Suscripcion s1 = new Basico();
        Suscripcion s2 = new Basico();

        s1 = new HD(s1);
        s1 = new UltraHD(s1);
        s1 = new DescargasOffline(s1);
        System.out.println(s1.descripcion() + " -> $"+s1.costo());

        s2 = new DescargasOffline(s2);
        System.out.println(s2.descripcion() + " -> $"+s2.costo());
        System.out.println("--------------------------------------");

        System.out.println("====PATRÓN FACADE====");
        Producto prod1 = new Producto("Shampoo Plusbelle", 1800);
        Producto prod2 = new Producto("Pañales Pampers", 15000);
        Producto prod3 = new Producto("Coca Cola 2,5L", 3200);
        ArrayList<Producto>productos = new ArrayList<>();
        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);
        TiendaFacade fachada = new TiendaFacade();
        fachada.comprar(productos,"Lamadrid 200");
        System.out.println("");

        System.out.println("====PATRÓN PROXY====");
        Usuario user1 = new Usuario("Jorge Pérez");
        Usuario user2 = new Usuario("Laureano Rojas");
        user1.setTipoUsuario("LeCTor");
        user2.setTipoUsuario("Experto de negocio");
        user2.setTipoUsuario("CliENTe");
        ArchivoProxy archivo1 = new ArchivoProxy("PatronesEstructuralesTP",".pdf",user1);
        ArchivoProxy archivo2 = new ArchivoProxy("ElPrincipito", ".docx", user2);
        archivo1.abrirArchivo();
        archivo2.abrirArchivo();
        System.out.println("");

        System.out.println("====PATRÓN COMPOSITE====");
        // --- Creación de platos individuales ---
        ElementoMenu platoPrincipal1 = new Plato("Bife de Chorizo", 1500.0);
        ElementoMenu platoPrincipal2 = new Plato("Milanesa a la Napolitana", 1200.0);
        ElementoMenu postre1 = new Plato("Flan con Dulce de Leche", 600.0);
        ElementoMenu bebida1 = new Plato("Agua sin gas", 300.0);
        // --- Creación de un submenú ---
        Menu submenuPostres = new Menu("Postres Especiales");
        submenuPostres.agregar(postre1);
        submenuPostres.agregar(new Plato("Helado Artesanal", 700.0));
        // --- Creación del menú principal que contiene platos y el submenú ---
        Menu menuPrincipal = new Menu("Menú del Día");
        menuPrincipal.agregar(platoPrincipal1);
        menuPrincipal.agregar(platoPrincipal2);
        menuPrincipal.agregar(bebida1);
        menuPrincipal.agregar(submenuPostres); // Agregamos un menú dentro de otro
        System.out.println("--- BIENVENIDO AL RESTAURANTE ---");
        menuPrincipal.mostrar("");
        System.out.println("");

        System.out.println("====PATRÓN FLYWEIGHT====");
        Bosque bosque = new Bosque();
        bosque.plantarArboles();
    }
}