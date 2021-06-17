/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc06;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exerc06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int km_dirigidos;
       int gas_consumida;
       String resposta;
       int somaKm = 0;
       int somaGas = 0;
       
       do {
            
            System.out.print("Informa a quilometragem dirigida: ");
            km_dirigidos = entrada.nextInt();

            System.out.print("Informa a gasolina consumida: ");
            gas_consumida = entrada.nextInt();

            float consumo;
            consumo = km_dirigidos / gas_consumida;
            System.out.println("Consumo (Km/l: " + consumo + " km/l");

            somaKm = somaKm + km_dirigidos;
            System.out.println("Km Total dirigida: " + somaKm + " km");

            somaGas = somaGas + gas_consumida;
            System.out.println("Km Total dirigida: " + somaGas + " l");

            System.out.println("Deseja adicionar um novo dado? (S ou N)");
            resposta = entrada.next();

        } while ("S".equals(resposta) || "s".equals(resposta));
      

    }
    
}
