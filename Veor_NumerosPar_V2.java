package curso;
import java.util.Scanner;
public class Veor_NumerosPar_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			if ((x[i] % 2) == 0)
				System.out.println(x[i]);
			else 
				System.out.println("Impar - fim do programa");
			
		
		}
		

	}

}
