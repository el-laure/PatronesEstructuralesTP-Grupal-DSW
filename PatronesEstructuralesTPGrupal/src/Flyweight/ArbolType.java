package Flyweight;

public class ArbolType {
    private final String tipo;
    private final String textura;
    private final String color;

    public ArbolType(String tipo, String textura, String color) {
        this.tipo = tipo;
        this.textura = textura;
        this.color = color;
    }

    public void dibujar(int x, int y) {
        System.out.printf(
                "Dibujando árbol de tipo %s, textura %s, color %s en (%d, %d)%n",
                tipo, textura, color, x, y
        );
    }
}
