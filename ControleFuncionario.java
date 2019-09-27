package curso;
import java.util.Scanner;
import entities.Funcionario;
public class ControleFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//To instanciando a classe Funcionario para criar o Objeto Funcionario cujo o nome é f1
		Funcionario f1 = new Funcionario();
		System.out.println("Digite o nome do funcionario");
		f1.nome = sc.next();
		System.out.println("Digite o salario do funcionario");
		f1.salario = sc.nextDouble();
		System.out.println("Digite a quantidade total de impostos a serem descontados");
		f1.tax = sc.nextDouble();
		
		//System.out.print(f1.nome + ", " + f1.salario + ", " + f1.tax + ", ");
		System.out.println("Nome do funcionario: " + f1.nome);
		System.out.println("Salario Bruto: " + f1.salario);
		System.out.println("Total de descontos: " + f1.tax);
		System.out.println("Salario liquido: " + f1.DescSalario());
		
		System.out.println("Quantos porcento de aumento?");
		f1.AumSalario(sc.nextDouble());
		System.out.println("Salario Final após o aumento: " + f1.salario);
		
		
		
		sc.close();
	}

}
