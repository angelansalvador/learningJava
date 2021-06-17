/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc03;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exerc03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int a , b , c;
       
       do{
        System.out.println("\n==== É triangulo? De quê tipo? ====\n\n");   
        
        System.out.print("Informe o primeiro lado: ");
        a = entrada.nextInt();
        
        System.out.print("Informe o segundo lado: ");
        b = entrada.nextInt();
        
        System.out.print("Informe o terceiro lado: ");
        c = entrada.nextInt();
           
        if (a<b+c && b<a+c && c<a+b){
            System.out.println("É triângulo!!\n");
            
            if(a==b && a==c && b==c){
                System.out.println("Parabéns... Você é pai de um Triângulo Equilátero");
            }
            else if (a!=b && a!=c && b!=c){
                System.out.println("Parabéns... Você é pai de um Triângulo Escaleno");
            }
            else{
                System.out.println("Parabéns... Você é pai de um Triângulo Isóceles");
            }
            
        } else{
            System.out.println("Não é triângulo. Tente Novamente");
        }
       } while (a>=b+c || b>=a+c || c>=a+b);
    }
    
}
