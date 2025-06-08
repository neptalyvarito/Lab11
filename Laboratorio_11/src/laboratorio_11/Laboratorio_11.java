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
       PantallaUsuario pu = new PantallaUsuario();
       pu.setVisible(true);
       System.out.print("adae");
       new iniciarSecion().setVisible(true);
      
       //new PantallaUsuario().setVisible(true);
    }
}
