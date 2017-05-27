/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3listadoble;

import javax.swing.JOptionPane;
import model.ListaDoble;

/**
 *
 * @author joser
 */
public class Semana3ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaDoble ld = new ListaDoble();
        
        ld.add("Hola");  //PRUEBA ADD
        ld.add("No");
        ld.add("Me");
        ld.add("Joda");
//        ld.AddFirst("Oiga!"); //PRUEBA ADDFIRST
//        ld.addIndex("Usted!!", 1); //PRUEBA ADDINDEX
        ld.remove(3); // PRUEBA REMOVE
        System.out.println(ld.toString());
        
        
    }
    
}
