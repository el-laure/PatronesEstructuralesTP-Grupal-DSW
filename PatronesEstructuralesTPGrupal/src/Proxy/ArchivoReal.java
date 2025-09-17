package Proxy;

public class ArchivoReal implements Archivo {
    private String nomArchivo;
    private String extension;

    public ArchivoReal(String nombre, String ext){
        this.nomArchivo=nombre;
        this.extension=ext;
    }

    @Override
    public void abrirArchivo(){
        System.out.println("Abriendo archivo " +nomArchivo+extension+"...");
        System.out.println("El archivo se ha abierto con éxito para ser leído.");
    }
}
