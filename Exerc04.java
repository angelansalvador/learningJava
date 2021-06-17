/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc04;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exerc04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double indicePoluicao;
       int industria;
       
       
       do{
        System.out.print("Grupo da Indústria (1, 2 ou 3): ");
        industria = entrada.nextInt();
                
        if (industria < 1 || industria > 3){
            System.out.println("Tente Novamente. Escolha entre os grupos 1, 2 ou 3");
        }
        } while (industria < 1 || industria > 3);
       
        System.out.print("Índice de Poluição medido: ");
        indicePoluicao = entrada.nextDouble();
        
        if (indicePoluicao >= 0.5) {
            System.out.println("Suas atividades estão suspensas por conta do alto índice de poluição liberado por sua indústria");
        } else if (indicePoluicao >= 0.4) {
            if (industria == 1 || industria == 2) {
                System.out.println("Suas atividades estão suspensas por conta do alto índice de poluição liberado por sua indústria");
            } else {
                System.out.println("Parabéns pelo controle até aqui! Continue controlando a emissão de agentes poluentes. Estamos de olho em você!");
            }
        } else if (indicePoluicao >= 0.3) {
            if (industria == 1) {
                System.out.println("Suas atividades estão suspensas por conta do alto índice de poluição liberado por sua indústria");
            } else {
                System.out.println("Parabéns pelo controle até aqui! Continue controlando a emissão de agentes poluentes. Estamos de olho em você!");
            }
        } else {
            System.out.println("Parabéns pelo controle até aqui! Continue controlando a emissão de agentes poluentes. Estamos de olho em você!");
        }

        
    }
}
