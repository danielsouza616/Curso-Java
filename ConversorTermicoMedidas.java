package curso;
import java.util.Scanner;
public class ConversorTermicoMedidas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius = 0, fahrehit = 0, milimetros = 0, polegadas = 0;
		int menu = 0;
		String condicao = "S";

		//laço de repetição
		while(condicao.equalsIgnoreCase("S")) {
			// menu de exibição
			System.out.println("Bem-Vindo ao Conversor: ");
			System.out.println("[1] Celsius -> Fahrenheit");
			System.out.println("[2] Fahrenheit -> Celsius");
			System.out.println("[3] Milímetros -> Polegadas");
			System.out.println("[4] Polegadas -> Milímetros");
			System.out.println("Informe a opção desejada: ");
			menu = sc.nextInt();
			//menu de escolhas
			switch (menu) {
			case 1:  // converter Celsius -> Fahrenheit
				System.out.println("Informe a temperatura em Celsius: ");
				celsius = sc.nextDouble();
				celsius = (celsius * 9/5) + 32;
				System.out.println("A memida convertida é: " + celsius + " fahrehit");
				break; 
			case 2: //  converter Fahrenheit -> Celsius
				System.out.println("Informe a temperatura em Farehit: ");
				fahrehit = sc.nextDouble();
				fahrehit = (fahrehit -32) *5/9;
				System.out.println("A memida convertida é: " + fahrehit + " celsius");
				break;
			case 3:  //converter Milímetros -> Polegadas
				System.out.println("Informe quantos milímetros: ");
				milimetros = sc.nextDouble();
				milimetros = (milimetros / 25.4);
				System.out.println("A medida convertida é: " + milimetros + " polegadas");
				break;
			case 4: // converter Polegadas -> Milímetro
				System.out.println("Informe quantas polegadas: ");
				polegadas = sc.nextDouble();
				polegadas = (polegadas * 25.4);
				System.out.println("A medida convertida é: " + polegadas + " milímetros");
				break;
			}
			System.out.println("Deseja continuar [S] ou [N]? ");
			condicao = sc.next(); 
			System.out.println("##### PROGRAMA ENCERRADO ##### ");
		}
		sc.close();
	}
}