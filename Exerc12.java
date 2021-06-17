
package exerc12;

import java.io.IOException;
import java.util.Scanner;

public class Exerc12 {

   
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        float a=0;
        float b=0;
        float c=0;
        
        System.out.println("----- BEM VINDO AO PROGRAMA DE CALCULO DE FORMAS -----");

        do {
            do {
                System.out.print("\n\nEscolha sua opção:\n"
                        + "1- Inserir dados de entrada\n"
                        + "2- Área do Trapézio\n"
                        + "3- Área do quadrado\n"
                        + "4- Área da superfície do cubo\n"
                        + "5- Sair\n"
                        + ">>> ");
                opcao = entrada.nextInt();
                if (opcao < 1 && opcao > 5) {
                    System.out.println("Erro - Escolha uma das opções permitidas");
                }
            } while (opcao < 1 && opcao > 5);

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro valor: ");
                    a = entrada.nextFloat();
                    System.out.print("Digite o segundo valor: ");
                    b = entrada.nextFloat();
                    System.out.print("Digite o terceiro valor: ");
                    c = entrada.nextFloat();
                    break;
                case 2:
                    float area_trapezio = areaTrapezio(a, b, c);
                    System.out.println(">>>>>>> A área do Trapézio é: " + area_trapezio+ " <<<<<<<<<");
                    System.in.read();
                    break;
                case 3:
                    float area_quadrado = areaQuadrado(b);
                    System.out.println("A área do Quadrado é: " + area_quadrado);
                    System.in.read();
                    break;           
                case 4:
                    float area_cubo = areaCubo(c);
                    System.out.println("A área da superfície do Cubo é: " + area_cubo);
                    System.in.read();
                    break;
                case 5:
                    System.out.println("Good Bye!");
                    System.in.read();
                    break;
                default:
                    break;
            }                                  
        } while (opcao!=5);
          
    }
    
    private static float areaTrapezio (float a, float b, float c){
        float area = (a+b)/2*c;
        return area;
    }
    
    private static float areaQuadrado (float b){
    float area = b*b;
    return area;
    }
    
    private static float areaCubo (float c){
    float area = 6*(c*c);
    return area;
    }
    
    
    
}
