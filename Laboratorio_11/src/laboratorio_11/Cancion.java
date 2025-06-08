/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_11;

/**
 *
 * @author neptaly
 */
public class Cancion {
    
    private String autor;
    private String fecPublicacion;
    private String duracion;
    private String nombre;
    
    public Cancion(String autor, String nombre, String fecPublicacion, String duracion){
        this.autor = autor;
        this.fecPublicacion = fecPublicacion;
        this.duracion = duracion;
        this.nombre = nombre;
    }
    
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDuracion(){
        return this.duracion;
    }
    public void setDuracion(String dur){
        this.duracion = dur;
    }





}
