/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;
import java.util.Scanner;
        
/**
 *
 * @author socamporomani
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);

        float cambio=1852f, metros;
        System.out.println("introduce las millas para cambiar");
        float millas=ler.nextFloat();
        metros=millas*cambio;
        System.out.println("estos son los Metros " + metros);
    }
    
}
