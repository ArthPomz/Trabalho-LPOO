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
		
		PilhaPaginas pilha = new PilhaPaginas();
		
		Scanner sc = new Scanner (System.in);
		
		int opcao = 0;
		
		System.out.println("     ----Bem vindo ao nosso sistema!----");
		do {
            System.out.println("\nPor gentileza escolha uma das opções a seguir: \n" 
                    + "1 - Acessar nova página.\n"
                    + "2 – Voltar para página anterior.\n"
                    + "3 – Ver página atual.\n"
                    + "4 – Exibir histórico de navegação.\n"
                    + "5 – Sair.\n");
            
            String opcaoStr = sc.nextLine();
            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException erro) {
                System.out.println("Opção inválida! Digite um número de 1 a 5.");
                continue;
            }

            switch (opcao) {
		    case 1:
		        System.out.println("Para acessar uma nova pagina digite:");

		        System.out.print("Titulo da pagina: ");
		        String titulo = sc.nextLine(); 
		        System.out.println("Titulo adicionado");

		        System.out.print("Agora informe o URL da página: ");
		        String url = sc.nextLine(); 

		        pilha.push(new Pagina(titulo, url));
		        System.out.println("Pagina adicionada com sucesso!\n");
		        break;
		
		case 2:
			
			Pagina removida = pilha.pop();
			
			if (removida != null) {
				System.out.println("Voltando a pagina anterior: " + removida );
			} else {
				System.out.println("Não há paginas para voltar." );
			}
			break;
		
		case 3:
			Pagina atual = pilha.peek();
			
			if (atual != null) {
				System.out.println("Pagina atual: " + atual );
			} else {
				System.out.println("Não há paginas para voltar." );
			}
			
			break;
		
		case 4:
		    if (pilha.isEmpty()) {
		        System.out.println("O histórico está vazio.");
		    } else {
		        System.out.println("Histórico de navegação:");
		        PilhaPaginas pilhaAux = new PilhaPaginas();

		        while (!pilha.isEmpty()) {
		            Pagina pagina = pilha.pop();
		            System.out.println(pagina); 
		            pilhaAux.push(pagina); 
		        }

		        while (!pilhaAux.isEmpty()) {
		            pilha.push(pilhaAux.pop());
		        }
		    }
		    break;
			
		case 5:
			System.out.println("\nAté logo!");
			sc.close();
			
            }
		}while (opcao != 5);
		
	}

}
