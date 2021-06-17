
package exerc13;


import java.util.Scanner;
import java.io.IOException;


public class Exerc13 {


    public static void main(String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        double tempo;
        double soma_taxas = 0;
        String resposta;
        
        
        do {
            System.out.print(" Digite o tempo para calcular taxa (hh,mm): ");
            tempo = entrada.nextDouble();

            System.out.println("Valor estacionamento: R$" + calcularTaxa(tempo));
            System.in.read();
            
            soma_taxas = calcularTaxa(tempo) + soma_taxas;

            System.out.print("Deseja calcular outro veículo? (S ou N):");
            resposta = entrada.next();
            System.out.println("--------------------------------");

        } while ("S".equalsIgnoreCase(resposta));
        
        System.out.println("VALOR TOTAL DOS RECIBOS >>> R$"+ soma_taxas);
        
        

    }

    private static double calcularTaxa(double tempo) {
        if (tempo <= 3) {
            return 2;
        } else {
            double horas = (tempo - 3);
            if (horas % 1 == 0) {
                return 2 + (horas * 0.50);
            } else {
                horas++;
                return 2 + ((horas - (horas % 1)) * 0.5);
            }
        }
    }

}

//DecimalFormat df = new DecimalFormat("0");
//            df.setRoundingMode(RoundingMode.HALF_UP);
//            df.format(horas);
//            System.out.println(horas);
