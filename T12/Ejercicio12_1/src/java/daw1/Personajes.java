/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1;

/**
 *
 * @author RSA
 */
public class Personajes {
    private String nombre;
    private String imagen;
    private String frase;
    
    public Personajes(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getImagen() {
        return imagen;
    }
    
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    public String getFrase() {
        return frase;
    }
}
