package Proxy;

public class Usuario {
    private static int contador=0;
    public int idUsuario;
    public String nomUsuario;
    public String tipoUsuario;

    public Usuario(String nomUsuario){
        contador++;
        this.idUsuario=contador;
        this.nomUsuario=nomUsuario;
        System.out.println("Se ha creado al usuario USER"+idUsuario+": "+nomUsuario);
    }

    public void setTipoUsuario(String tipo){
        tipoUsuario = tipo.toUpperCase();
        if (tipoUsuario.equals("LECTOR") || tipoUsuario.equals("ADMINISTRADOR") || tipoUsuario.equals("CLIENTE")){
            this.tipoUsuario=tipoUsuario;
            System.out.println("Se ha seteado al usuario USER"+idUsuario+" de nombre "+nomUsuario+" con el rol: "+tipoUsuario);
        } else {
            System.out.println("El tipo de usuario ingresado no es compatible con los parámetros del sistema.");
        }
    }
}
