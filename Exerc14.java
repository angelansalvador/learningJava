
package exerc14;

import java.util.Scanner;


public class Exerc14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total_gasto;

        System.out.print(" Digite o total gasto pelo cliente: ");
        total_gasto = entrada.nextDouble();

        switch (imprimeOpcoes()) {
            case 1:
                System.out.println("Preço Final: R$"+ calculaDesconto(total_gasto));
                break;
            case 2:
                System.out.println("Preço Final: 2x de R$"+ calculaSemJuros(total_gasto)
                        + "= R$"+ 2*calculaSemJuros(total_gasto));
                System.out.println("");
                break;
            case 3: 
                System.out.println("Em quantas vezes será parcelado:");
                int opcao_nParcelas = entrada.nextInt();
                System.out.println("Preço Final: "+ opcao_nParcelas + "x de R$"+ Math.round(calculaComJuros(total_gasto, opcao_nParcelas))
                        + " = R$"+ opcao_nParcelas * Math.round(calculaComJuros(total_gasto, opcao_nParcelas)));
                break;
            default:
                    break;                           

        }

    }

    private static int imprimeOpcoes() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--- OPÇÕES DE PAGAMENTO ---");
        System.out.println("1 - À vista com 10% de desconto");
        System.out.println("2 - 2x");
        System.out.println("3 - 3x a 10x - 3% de juros ao mês (Compras acima de R$100,00)");

        // solicitando qual opcao de pagamento:        
        System.out.println("Escolha uma opção: ");
        int opcao_pagamento = entrada.nextInt();
        return opcao_pagamento;

    }
    
    private static double calculaDesconto(double total_gasto){
        return total_gasto-(total_gasto*0.1);
    }

    private static double calculaSemJuros(double total_gasto) {
        return total_gasto/2;
    }

    private static double calculaComJuros(double total_gasto, int opcao_nParcelas) {
        return (total_gasto + (total_gasto*0.03*opcao_nParcelas))/opcao_nParcelas;
    }

}
