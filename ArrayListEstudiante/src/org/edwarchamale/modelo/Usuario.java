package org.edwarchamale.modelo;
/**
 *
 * @author Edwar
 */
public class Usuario {
    String usuario;
    String clave;
    char rol;

    public Usuario() {
    }

    public Usuario(String usuario, String clave, char rol) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }
    
}
