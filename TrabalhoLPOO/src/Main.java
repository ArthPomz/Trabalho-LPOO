import java.util.Scanner;

/*Classe Main
• Implementar um menu de opções para o usuário interagir:
1 – Acessar nova página: solicitar título e URL e empilhar.
2 – Voltar para página anterior
3 – Ver página atual (título e URL)
4 – Exibir histórico de navegação.
5 – Sair.*/

public class Main {

			
	public static void main(String[] args) {
				
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escolha uma das opções a seguir: \n" 
				+ "1 - Acessar nova página: solicitar título e URL e empilhar. \n"
				+ "2 – Voltar para página anterior\n"
				+ "3 – Ver página atual (título e URL)\n"
				+ "4 – Exibir histórico de navegação.\n"
				+ "5 – Sair.\n");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			
			break;
		
		case 2:
			
			break;
		
		case 3:
			System.out.println("Sua página atual: ");
			break;
		
		case 4:
			
			break;
			
		case 5:
			System.out.println("\nAté logo!");
			sc.close();
			
		}
		
	}

}
