
package exerc10;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cod_curso;
        double vagas;
        double candidatosMasc;
        double candidatosFem;
        String resposta;
        double total_candidatos=0;
        double maior_candidato_vaga=0;
        String curso_maior_cv = "0000000000000000000";
        
        do {
            System.out.print("Digite o código o Curso: ");
            cod_curso = entrada.next();
            
            System.out.print("Digite o número de vagas neste curso: ");
            vagas = entrada.nextDouble();

            System.out.print("Digite o número de candidatos do sexo masculino: ");
            candidatosMasc = entrada.nextInt();

            System.out.print("Digite o número de candidatas do sexo feminino: ");
            candidatosFem = entrada.nextInt();

            System.out.println("Número de candidatos por vaga do curso de código " + cod_curso + ": "
                    + ((candidatosFem + candidatosMasc) / vagas));
            
            

//Calculo para definir qual maior curso no quesito candidato vaga (salvando seu código)   
            if (((candidatosFem + candidatosMasc) / vagas) > maior_candidato_vaga) {
                maior_candidato_vaga = ((candidatosFem + candidatosMasc) / vagas);
                curso_maior_cv = cod_curso;

            }
            System.out.println("Percentagem de candidatas do sexo feminino do curso de código <<" + cod_curso + ">>: "
                    + candidatosFem / (candidatosFem + candidatosMasc) * 100 + "%");

//Calculo para somar numero de candidatos:  
            total_candidatos = total_candidatos + candidatosFem + candidatosMasc;

            // Opção para adicionar uma nova mercadoria
            System.out.print("Deseja adicionar uma novo curso? (S ou N):");
            resposta = entrada.next();
            System.out.println("--------------------------------");

        } while ("S".equalsIgnoreCase(resposta));
        
        System.out.println("O maior número de candidatos por vaga é do curso de código <<"+ curso_maior_cv 
                + ">> possuindo <<" + maior_candidato_vaga+">> candidatos por vaga" );
        
        System.out.println("O total de candidatos é "+ total_candidatos);
        
        
        
        
        
        
    }
    
}
