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
public class listaCanciones {
    
    private static List<Cancion> listTodasCanciones = new ArrayList<>();
    
    public static void listaCanciones(){
        listTodasCanciones = null;
    }
    
    public static void agregarCancion(Cancion cancion){
        
        listTodasCanciones.add(cancion);
    }
    public static List<Cancion> getLista(){
        return listTodasCanciones;
    }
}
