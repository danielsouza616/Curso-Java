package curso;
import java.util.Scanner;
import entities.Conta;
public class ControleConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Conta c1;
		c1 = new Conta();
		System.out.println("Digite o nome do titular da conta");
		c1.nome = sc.next();
		System.out.println("Digite o número da conta");
		c1.numConta = sc.nextInt();
		c1.saldo = 500;
		c1.limite = 2000;
		
		System.out.println(" o titular da conta é: " + c1.nome);
		System.out.println("O número da conta é: " + c1.numConta);
		System.out.println("Seu saldo é de: " + c1.saldo);
		System.out.println("Seu limite é de: " + c1.limite);
		
		c1.saque(50000); //  saque
		c1.dep(500); // deposito
		System.out.println("saldo final: " + c1.saldo);
		
		
		Conta c2;
		c2 = new Conta();
		
		///System.out.println(c1.nome + c1.numConta + c1.saldo + c1.limite);
		
	
	}

}
