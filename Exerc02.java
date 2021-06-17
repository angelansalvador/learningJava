/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc02;

import java.util.Scanner;
import java.lang.Math;

public class Exerc02 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
       double raio;
         
        System.out.print("Informe o raio do círculo: ");
        raio = entrada.nextDouble();
        
        
        System.out.println("\n______Resultados______\n");
        
        System.out.println(" Diâmetro: "+ 2*raio +
                "\n Circunferência: "+ 2*Math.PI*raio +
                "\n Área do Círculo: "+ Math.PI*raio*raio);
    }
    
}
