package exerc11;

import java.util.Scanner;


public class Exerc11 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double preco_kwh;
        int n_consumidor;
        double kwh_mes;
        int tipo_consumidor;
        String resposta;
        double maior_consumo=0;
        double menor_consumo=99999;
        double soma_consumo=0;
        int contador_consumidor = 0;
        double soma1=0;
        double soma2=0;
        double soma3=0;
        
               
        do {
            System.out.print("Preço do KWh consumido: ");
            preco_kwh = entrada.nextDouble();

            System.out.print("Número do consumidor: ");
            n_consumidor = entrada.nextInt();

            System.out.print("Quantidade de KWh consumidos no mês: ");
            kwh_mes = entrada.nextDouble();

// Soma de todos os consumos para calculo de média
            soma_consumo = kwh_mes + soma_consumo;
// definição do Maior Consumo        
            if (kwh_mes > maior_consumo) {
                maior_consumo = kwh_mes;
            }
// definição do Menor Consumo 
            if (kwh_mes < menor_consumo) {
                menor_consumo = kwh_mes;
            }

            do {
                System.out.print("Tipo de Consumidor\n"
                        + "1 - residencial\n"
                        + "2 - comercial\n"
                        + "3 - industrial\n"
                        + "Digite o número referente ao tipo: ");
                tipo_consumidor = entrada.nextInt();
                if (tipo_consumidor != 1 && tipo_consumidor != 2 && tipo_consumidor != 3) {
                    System.out.println(" /n - CÓDIGO ERRADO - TENTE NOVAMENTE /n ");
                }
            } while (tipo_consumidor != 1 && tipo_consumidor != 2 && tipo_consumidor != 3);

            if (tipo_consumidor == 1) {
                soma1 = kwh_mes + soma1;
            } else if (tipo_consumidor == 2) {
                soma2 = kwh_mes + soma2;
            } else {
                soma3 = kwh_mes + soma3;
            }

            System.out.println("Consumidor Número " + n_consumidor);
            System.out.println("Total a pagar: " + (kwh_mes * preco_kwh));

            contador_consumidor++; // contador para calcular média.

            System.out.print("Deseja adicionar uma novo consumidor? (S ou N):");
            resposta = entrada.next();
            System.out.println("--------------------------------");

        } while ("S".equalsIgnoreCase(resposta));

        System.out.println("Maior consumo: " + maior_consumo);
        System.out.println("Menor consumo: " + menor_consumo);
        System.out.println("Consumo do Tipo de Consumidor 1: " + soma1);
        System.out.println("Consumo do Tipo de Consumidor 2: " + soma2);
        System.out.println("Consumo do Tipo de Consumidor 3: " + soma3);
        System.out.println("Média de Consumo: " + (soma_consumo / contador_consumidor));
        
        
        
        
        
        
        
    }
    
}
