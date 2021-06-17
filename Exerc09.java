
package exerc09;

import java.util.Scanner;

public class Exerc09 {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double altura;
        double alta1 = 0;
        int contagem_alta = 0;
        double alta2 = 0;


        do {
            System.out.print("Informe o nome da candidata: ");
            nome = entrada.next();

            if (!"FIM".equalsIgnoreCase(nome)) {

                System.out.print("Informe a altura de " + nome + ": ");
                altura = entrada.nextDouble();
                
                if (altura >= alta1) {
                    if (altura >= alta2) {
                        alta2 = alta1;
                        alta1 = altura;
                        contagem_alta++;
                    }
                }else if (altura>=alta2){
                   alta2 = altura; 
                }    
            }

        } while (!"FIM".equalsIgnoreCase(nome));

        System.out.println("Duas maiores alturas: "+ alta1 + " e " + alta2 +". "
                + "\nSendo que "+contagem_alta + " moça(s) apresentam essas alturas.");
    }
    
}
