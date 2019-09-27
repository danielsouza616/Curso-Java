package curso;
import entities.ConverterMparaP;
import java.util.Scanner;
public class Conversor {

    public static void main(String[] args) {
        exibirMenu();
        System.out.println("Programa encerrado.");
    }

    public static void exibirMenu() { //menu principal
        String condicao = "S";
       // double Celsius = 0, Fahrehit, Milimetros = 0, Polegadas;
        int Menu = 0;
        
        //ConverterMparaP c1;
        ConverterMparaP c1 = new ConverterMparaP();
        
        
        do {
            Scanner input = new Scanner(System.in);
            // menu de exibição
            System.out.println("Bem-Vindo ao Conversor: ");
            System.out.println("[1] Celsius -> Fahrenheit");
            System.out.println("[2] Fahrenheit -> Celsius");
            System.out.println("[3] Milímetros -> Polegadas");
            System.out.println("[4] Polegadas -> Milímetros");
            System.out.println("Informe a opção desejada: ");
            Menu = input.nextInt();

            //menu de escolhas
            switch (Menu) {
                case 1:  // converter Celsius -> Fahrenheit
                   // converterCparaF();
                    break;
                case 2: //  converter Fahrenheit -> Celsius
                 //   converterFparaC();
                    break;
                case 3:  //converter Milímetros -> Polegadas
                	c1.Milimetros = input.nextDouble();
                    break;
                case 4: // converter Polegadas -> Milímetro
                   // converterPparaM();
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            System.out.println("Deseja continuar [S] ou [N]? ");
             condicao = input.next(); 
             System.out.println("##### PROGRAMA ENCERRADO ##### ");
        } //while (Menu != 0);
        while(condicao.equalsIgnoreCase("S"));
        
		
	}
}