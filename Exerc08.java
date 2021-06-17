
package exerc08;

import java.util.Scanner;


public class Exerc08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double preco_compra;
        double preco_venda;
        double soma_compras=0;
        double soma_vendas=0;
        String resposta;
        int contagem_menor10 = 0;
        int contagem_menor20 = 0;
        int contagem_maior20 = 0;
        
      do{        
        System.out.print("Informe o nome da mercadoria: ");
        nome = entrada.next();
        
        System.out.print("Informe o preço de compra de " + nome + ": ");
        preco_compra = entrada.nextDouble();
        soma_compras = preco_compra+soma_compras; // soma de todas as compras
        
        System.out.print("Informe o preço de venda de " + nome + ": ");
        preco_venda = entrada.nextDouble();
        soma_vendas = preco_venda+soma_vendas; // soma de todas as vendas
        
                
    // Contagem de produtos com lucros em 10, 20 e acima de 20%
        //(100*(preco_venda-preco_compra)/preco_compra) = Porcentagem de Lucro
        if ((100 * (preco_venda - preco_compra) / preco_compra) < 10) {
              contagem_menor10++;
          } else if ((100 * (preco_venda - preco_compra) / preco_compra) < 20) {
              contagem_menor20++;
          } else {
              contagem_maior20++;
          }
        
            
    // Opção para adicionar uma nova mercadoria
        System.out.print("Deseja adicionar uma nova mercadoria? (S ou N):");
        resposta = entrada.next();
        System.out.println("--------------------------------");
                       
      } while ("S".equals(resposta) || "s".equals(resposta));  
        
        System.out.println("--------------------------------");
        System.out.println("Total Compras das Mercadorias: R$"+ soma_compras);
        System.out.println("Total Vendas das Mercadorias: R$"+ soma_vendas);
        System.out.println("Lucro Total com as Mercadorias: R$"+ (soma_vendas-soma_compras));
        System.out.println("--------------------------------");
        System.out.println("Mercadorias com Lucro menor de 10%: "+ contagem_menor10);
        System.out.println("Mercadorias com Lucro entre 10% e 20%: "+ contagem_menor20);
        System.out.println("Mercadorias com Lucro maior de 20%: "+ contagem_maior20);
        
    }

}
