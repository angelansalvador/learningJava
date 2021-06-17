
package exerc01;

import java.util.Scanner;


public class Exerc01 {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int a , b , c;
       
            
        System.out.print("Informe o primeiro número: ");
        a = entrada.nextInt();
        
        System.out.print("Informe o segundo número: ");
        b = entrada.nextInt();
        
        System.out.print("Informe o terceiro número: ");
        c = entrada.nextInt();
        
        System.out.println("____________________Resultados__________________________");
        
        System.out.println(" Soma: " + (a+b+c));
        System.out.println(" Produto: " + a*b*c);
        System.out.println(" Média: " + (a+b+c)/3);
        
        if (a > b) {
            if (a > c) {
                System.out.println("Maior: " + a);
            } else {
                System.out.println("Maior: " + c);
            }
        } else if (b > c) {
            System.out.println("Maior: " + b);
        } else {
            System.out.println("Maior: " + c);
        }
        
        if (a < b) {
            if (a < c) {
                System.out.println("Menor: " + a);
            } else {
                System.out.println("Menor: " + c);
            }
        } else if (b < c) {
            System.out.println("Menor: " + b);
        } else {
            System.out.println("Menor: " + c);
        }
            
            
     
        
        
       
       
    }
    
}
