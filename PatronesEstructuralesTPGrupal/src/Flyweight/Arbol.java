package Flyweight;

public class Arbol {
    private final int x;
    private final int y;
    private final ArbolType tipo;

    public Arbol(int x, int y, ArbolType tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void dibujar() {
        tipo.dibujar(x, y);
    }
}