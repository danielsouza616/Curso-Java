package curso;
import java.util.Scanner;
public class Convercao_Final_Prova_2019 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	exibirMenu();
    }

    public static void exibirMenu() { //menu principal
        String condicao = "S";
        double Celsius = 0, Fahrehit, Milimetros = 0, Polegadas;
        int Menu = 0;
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
                    converterCparaF();
                    break;
                case 2: //  converter Fahrenheit -> Celsius
                    converterFparaC();
                    break;
                case 3:  //converter Milímetros -> Polegadas
                    converterMparaP();
                    break;
                case 4: // converter Polegadas -> Milímetro
                    converterPparaM();
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
		
    	public static double converterCparaF(){
	    // converter Celsius -> Fahrenheit
	    double Celsius = 0, Fahrehit = 0;
	    Scanner input = new Scanner(System.in);//conversor de temperatura
	              System.out.println("Informe a temperatura em Celsius: ");
	              Celsius = input.nextDouble();
	              Celsius = (Celsius * 9/5) + 32;
	              System.out.println("A memida convertida é: " + Celsius + " fahrehit");
				return Fahrehit;
				
	} 
    	public static double converterFparaC() {
            double Celsius = 0, Fahrehit;

            Scanner input = new Scanner(System.in); //conversor de temperatura    
            System.out.println("Informe a temperatura em Farehit: ");
            Fahrehit = input.nextDouble();
            Fahrehit = (Fahrehit - 32) * 5 / 9;
            System.out.println("A medida convertida é: " + Fahrehit + " celsius");
			return Celsius;

        }
    	public static double converterMparaP() {
            double Milimetros = 0, Polegadas = 0;

            Scanner input = new Scanner(System.in);//conversor de medidas
            //converter Milímetros -> Polegadas
            System.out.println("Informe quantos milímetros: ");
            Milimetros = input.nextDouble();
            Milimetros = (Milimetros / 25.4);
            System.out.println("A medida convertida é: " + Milimetros + " polegadas");
			return Polegadas;
        }
    	public static double converterPparaM() {
            double Milimetros = 0, Polegadas;
            String condicao = "S";
            Scanner input = new Scanner(System.in);
            // converter Polegadas -> Milímetro
            System.out.println("Informe quantas polegadas: ");
            Polegadas = input.nextDouble();
            Polegadas = (Polegadas * 25.4);
            System.out.println("A medida convertida é: " + Polegadas + " milímetros");
			return Milimetros;
        }
    }