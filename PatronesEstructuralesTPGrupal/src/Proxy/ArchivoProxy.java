package Proxy;

public class ArchivoProxy implements Archivo{
    private String nomArchivo;
    private String extension;
    private Usuario user;
    private ArchivoReal archivoReal;

    public ArchivoProxy(String nombre, String ext, Usuario user) {
        this.nomArchivo=nombre;
        this.extension=ext;
        this.user=user;
    }

    @Override
    public void abrirArchivo(){
        if (user.tipoUsuario.equals("LECTOR") || user.tipoUsuario.equals("ADMINISTRADOR")){
            ArchivoReal archivo = new ArchivoReal(nomArchivo,extension);
            archivo.abrirArchivo();
        } else {
            System.out.println("El usuario "+user.nomUsuario+" de tipo "+user.tipoUsuario+" no tiene permisos de abrir el archivo solicitado");
        }
    }
}
