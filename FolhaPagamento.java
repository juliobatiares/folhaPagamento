package folhaPagamento;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		int selecaoMPrincipal = 0;
		
		Scanner input = new Scanner(System.in);
		
		showMenuPrincipal();
		
		selecaoMPrincipal = input.nextInt();
		
		calculoFolha(selecaoMPrincipal);
		
	}
	
	public static void showMenuPrincipal() {
		
		System.out.println("Ol�!\n\nSeja Bem Vindo(a) ao Sistema\n..::FOLHA DE PAGAMENTO::..\n");
		System.out.println("Escolha o n�mero referente ao Grupo de Funcion�rios que deseja calcular a Folha de Pagamento:");
		System.out.printf("%-5s%20s%n%-5s%20s%n%-5s%20s%n%-5s%20s%n%s%n%-5s%4s%n", "1.","Funcion�rios Assalariados",
									  								  "2.", "Funcion�rios Por Hora",
									  								  "3.", "Funcion�rios Comissionados",
									  								  "4.", "Funcion�rios Assalariados - Comissionados",
									  								  "-------------------",
									  								  "0.", "Sair");
	}
	
	public static void calculoFolha(int selecaoMPrincipal) {
		
		Scanner input = new Scanner(System.in);
		
		switch (selecaoMPrincipal) {
			case 0:
				System.out.println("\nSistema Finalizado...\n");
				break;
			case 1:
				System.out.println("\nFuncion�rios Assalariados:\n");
				break;
			case 2:
				System.out.println("\nFuncion�rios Por Hora:\n");
				break;
			case 3:
				System.out.println("\nFuncion�rios Comissionados:\n");
				break;
			case 4:
				System.out.println("\nFuncion�rios Assalariados - Comissionados:\n");
				break;
			default:
				System.out.println("\nDigite um n�mero v�lido.\n");
				showMenuPrincipal();
				selecaoMPrincipal = input.nextInt();
				calculoFolha(selecaoMPrincipal);
				break;
				
		}
	}
	
}
