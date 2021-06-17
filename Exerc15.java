
package exerc15;

import java.util.Scanner;


public class Exerc15 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int[] assentos = new int[10];
        int i;       
        int classe;
        int pc = 0;
        int sc = 5;

        //criando assentos desocupados 
        for (i = 0; i < assentos.length; i++) {
            assentos[i] = 0;
        }
        
        do{     
            System.out.println("\n--- BEM VINDO A MARCOS AIR ---");
            System.out.print("\nEscolha a classe que deseja:"
                    + "\nPressione 1 para Primeira Classe"
                    + "\nPressione 2 para Classe Executiva"
                    + "\nPressione 3 para Sair"
                    + " \n>>>> ");
            classe = entrada.nextInt();
            
            

            if (classe == 1) {
                if (assentos[pc] == 0) {
                    primeiraClasse(assentos, pc, sc);
                    pc++;
                } else {
                    pc++;
                    primeiraClasse(assentos, pc, sc);
                    pc++;
                }
            } else if (classe == 2) {
                if (assentos[sc] == 0) {
                    classeExecutiva(assentos, pc, sc);
                    sc++;
                } else {
                    sc++;
                    classeExecutiva(assentos, pc, sc);
                    sc++;
                }
            }
            
            
            
        }while (classe!=3);
                
    }

    private static void primeiraClasse(int[] assentos, int pc, int sc) {
        if (pc > 4) {
            String resposta;
            System.out.println("Acabaram as vagas para essa classe. \n"
                    + " Você gostaria de tentar uma vaga na Classe Executiva (S ou N)");
            resposta = entrada.next();
            if ("S".equalsIgnoreCase(resposta)) {
                classeExecutiva(assentos, sc, pc);
            } else {
                System.out.println("Aguarde o Próximo vôo!!!");
            }
        } else {
            assentos[pc] = 1;
            pc++;
            System.out.println("Seu assento é o >>"+ pc +"<< na Primeria Classe");
        }
    }

    private static void classeExecutiva(int[] assentos, int pc, int sc) {

        if (sc > 9) {
            String resposta;
            System.out.println("Acabaram as vagas para essa classe. \n "
                    + "Você gostaria de tentar uma vaga na Primeira Classe (S ou N)");
            resposta = entrada.next();
            if ("S".equalsIgnoreCase(resposta)) {
                primeiraClasse(assentos, sc, pc);
            } else {
                System.out.println("Aguarde o Próximo vôo!!!");
            }
        } else {
            assentos[sc] = 1;
            sc++;
            System.out.println("Seu assento é o >>"+ sc +"<< na Classe Executiva");
        }

    }
    
}

