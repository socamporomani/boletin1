/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;                                       //

/**
 *
 * @author socamporomani
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner ler =new Scanner(System.in);                        //
        
        float dolar=0f, euros, cambio=0f;
        System.out.println("euros");
        euros=ler.nextFloat();                                  //todos estos 3son necesarios para leer por teclado
        System.out.println("cambio");
        cambio=ler.nextFloat();
        dolar=euros*cambio;
        System.out.println("Tu cambio es de "+dolar+"$");
        
                

        
    }
    
}
