/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_11;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author neptaly
 */
public class PlayList {
    
    private String nombre;
    private List<Cancion> listaCanciones;
    
    public PlayList(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarCanciones(Cancion cancion){
        if(listaCanciones == null){
            listaCanciones = new ArrayList<>();
        }
        this.listaCanciones.add(cancion);
    }
    
    public List<Cancion> getListaCanciones(){
        if(listaCanciones == null){
            listaCanciones = new ArrayList<>();
        }
        return this.listaCanciones;
    }
     
    public String getNombrePlayList(){
        return this.nombre;
    }
    
    public void setNombrePlayList(String nombre){
        this.nombre = nombre;
    }            
}
