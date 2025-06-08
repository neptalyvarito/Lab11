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
public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private List<PlayList> listaDePlayList;
    
    public Usuario(String nombre, String correo, String contraseña){
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña=contraseña;
        this.listaDePlayList = new ArrayList<>();
    } 
    
    public void crearNuevaPlayList(String nombre){
        PlayList playList = new PlayList(nombre);
    }
    
    public List<PlayList> getListaDePlayList(){
        return this.listaDePlayList;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCorreo(){
        return this.correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getContraseña(){
        return contraseña;
    }
}
