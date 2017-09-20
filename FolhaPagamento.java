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
				Assalariado asl = new Assalariado("Julio", "Software", "11-04-2016", 682);
				
				System.out.printf("%-15s%-15s%-20s%-15s%n", "Nome:", "Setor:", "Dt. Admiss�o:", "Sal�rio Fixo:");
				System.out.printf("%-15s%-15s%-20sR$ %-15s%n%n", asl.getNome(), asl.getSetor(), asl.getDataAdm(), asl.getSalFixo());
				
				showMenuPrincipal();
				selecaoMPrincipal = input.nextInt();
				calculoFolha(selecaoMPrincipal);
				break;
			case 2:
				System.out.println("\nFuncion�rios Por Hora:\n");
				Horista hr = new Horista("Andr�", "Laser", "19-12-2016", 682, 15);
				
				System.out.printf("%-15s%-15s%-20s%-20s%-20s%n", "Nome:", "Setor:", "Dt. Admiss�o:", "Sal�rio Fixo:", "Sal�rio + H.E.:");
				System.out.printf("%-15s%-15s%-20sR$ %-17.2fR$ %,.2f%n%n", hr.getNome(), hr.getSetor(), hr.getDataAdm(), hr.getSalFixo(), hr.getCalculoHorista(hr.getSalFixo(), 15));
				
				showMenuPrincipal();
				selecaoMPrincipal = input.nextInt();
				calculoFolha(selecaoMPrincipal);
				break;
			case 3:
				System.out.println("\nFuncion�rios Comissionados:\n");
				Comissionado cms = new Comissionado("Pedro", "Suprimentos", "15-06-2011", 6000, 0.08);
				
				System.out.printf("%-15s%-15s%-20s%-20s%-20s%n", "Nome:", "Setor:", "Dt. Admiss�o:", "Total de Vendas:", "Sal�rio(" + cms.getPercentual() + "% sobre Vendas)");
				System.out.printf("%-15s%-15s%-20sR$ %-17.2fR$ %,.2f%n%n", cms.getNome(), cms.getSetor(), cms.getDataAdm(), cms.getTotVendas(), cms.getTotComissionado(cms.getTotVendas(), cms.getPercentual()));
				
				showMenuPrincipal();
				selecaoMPrincipal = input.nextInt();
				calculoFolha(selecaoMPrincipal);
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
		input.close();
	}
	
}
