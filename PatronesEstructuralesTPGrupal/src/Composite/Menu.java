package Composite;
import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu{
    private String nombre;
    private List<ElementoMenu> items = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ElementoMenu item) {
        items.add(item);
    }

    public void remover(ElementoMenu item) {
        items.remove(item);
    }

    @Override
    public void mostrar(String indent) {
        System.out.println(indent + "+ Menú: " + nombre);

        for (ElementoMenu item : items) {
            item.mostrar(indent + "  ");
        }
    }
}
