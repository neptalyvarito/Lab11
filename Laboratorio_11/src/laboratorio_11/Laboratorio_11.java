/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package laboratorio_11;

import java.util.HashMap;

/**
 *
 * @author neptaly
 */
public class Laboratorio_11 {
    /**
     * @param args the command line arguments
     */
    public static HashMap<String, Usuario> usuarios = new HashMap<>();
    public static void main(String[] args) {
       Usuario user = new Usuario("nepta", "nepta", "123"); 
       Cancion can1= new Cancion("Andres Calamaro", "Para no olvidar", "1992", "3:30");
       Cancion can2= new Cancion("Los Rodrigues", "Mucho mejor", "2002", "2:43");
       Cancion can3= new Cancion("Charly Garcia", "Los dinosaurios", "1990", "4:30");
       Cancion can4= new Cancion("Los prisioneros", "Quieren dinero", "1984", "5:13");
       Cancion can5= new Cancion("Sentimiento Fatal", "Los violadores", "1982", "4:22");
       listaCanciones.agregarCancion(can1);
       listaCanciones.agregarCancion(can2);
       listaCanciones.agregarCancion(can3);
       listaCanciones.agregarCancion(can4);
       listaCanciones.agregarCancion(can5);
       new PantallaUsuario(user).setVisible(true);
       //new iniciarSecion().setVisible(true);
      
       //new PantallaUsuario().setVisible(true);
    }
}
