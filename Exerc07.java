
package exerc07;

import java.util.Scanner;


public class Exerc07 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;//numero de empregados
        double horasTrabalhadas;
        double salarioHora;
        double salarioBruto;
        double somaSalarios = 0;
        
        System.out.print("Informe o número de funcionários em sua empresa: ");
        n = entrada.nextInt();
        
        for (int i=0; i < n; i++){
        System.out.print("Informe as horas trabalhadas na semana do " + (i+1) + "o funcionário: ");
        horasTrabalhadas = entrada.nextDouble();
        
        System.out.print("Informe o salário-hora do " + (i+1) + "o funcionário: ");
        salarioHora = entrada.nextDouble();
        
        if (horasTrabalhadas <= 40){
            salarioBruto = horasTrabalhadas * salarioHora;
        } else{
            salarioBruto = horasTrabalhadas * salarioHora + (horasTrabalhadas-40) * salarioHora+(salarioHora*0.5);
        }
        System.out.println("Salário Bruto do " + (i+1) + "o funcionário: " + salarioBruto);
        System.out.println("------------------------");
        
        somaSalarios=salarioBruto + somaSalarios;
        
        }
        
        System.out.println("Total pago em salário para todos os empregados: "+ somaSalarios);
        
        
        
    }
    
}
