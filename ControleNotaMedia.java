package curso;
import java.util.Scanner;
import entities.Aluno;
public class ControleNotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Aluno a1 = new Aluno();
		
		System.out.println("Digite o nome do aluno");
		a1.nome = sc.next();
		System.out.println("Digite a nota do primeiro trimestre");
		a1.n1 = sc .nextDouble();
		System.out.println("Digite a nota do segundo trimestre");
		a1.n2 = sc.nextDouble();
		System.out.println("Digite a nota do terceiro trimestre");
		a1.n3 = sc.nextDouble();
		
		System.out.println("Nota média do aluno:" + a1.NotaMedia());
		
		if (a1.NotaMedia() < 60) {
			System.out.println("Aluno não aprovado");
			System.out.println("Faltou " + a1.Aprovation() + "pontos");
		}
		else {
			System.out.println("Aluno aprovado");
		}
		
		
	sc.close();	
	}

}
