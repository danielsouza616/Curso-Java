package curso;

/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

import java.util.Scanner;
public class SalarioHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double valorH, hora;
        double salario;
        
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de funcionario: ");
        int number = sc.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        double hora = sc.nextDouble();
        System.out.println("Informe o valor ganho por hora: ");
        double valorH = sc.nextDouble();
        
        salario = hora * valorH;
        
        System.out.println("O número de funcionario é: " + number);
        System.out.println("O total de horas trabalhadas foi de: " + hora);
        System.out.println("O valor da hora é: " + valorH);
        System.out.println("Salario final: " + salario);
        
        sc.close();
	}

}
