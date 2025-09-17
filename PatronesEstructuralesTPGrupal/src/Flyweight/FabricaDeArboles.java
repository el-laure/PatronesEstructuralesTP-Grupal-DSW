package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    private final Map<String, ArbolType> tiposDeArboles = new HashMap<>();

    public ArbolType obtenerTipoDeArbol(String tipo, String textura, String color) {
        String clave = tipo + "_" + textura + "_" + color;
        if (!tiposDeArboles.containsKey(clave)) {
            tiposDeArboles.put(clave, new ArbolType(tipo, textura, color));
        }
        return tiposDeArboles.get(clave);
    }
}