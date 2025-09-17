package Flyweight;

import java.util.Random;

public class Bosque {
    private final FabricaDeArboles fabrica = new FabricaDeArboles();
    private final Random random = new Random();

    public void plantarArboles() {
        String[] tipos = {"Roble", "Pino", "Abeto"};
        String[] texturas = {"Lisa", "Rugosa"};
        String[] colores = {"Verde", "Marrón"};

        // Simulamos la creación de 10 árboles para no saturar la consola
        for (int i = 0; i < 10; i++) {
            String tipo = tipos[random.nextInt(tipos.length)];
            String textura = texturas[random.nextInt(texturas.length)];
            String color = colores[random.nextInt(colores.length)];
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);

            ArbolType tipoDeArbol = fabrica.obtenerTipoDeArbol(tipo, textura, color);
            Arbol arbol = new Arbol(x, y, tipoDeArbol);
            arbol.dibujar();
        }
    }
}
