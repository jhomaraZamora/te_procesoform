
package com.emergentes.modelo;

/**
 *
 * @author JHOMARA
 */
public class Registro {
    private String  nombre;
    private String correo;
    private String telefono;

    public Registro() {
        this.nombre = "";
        this.correo = "";
        this.telefono ="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
