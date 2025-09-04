import java.util.ArrayList;

/*Implementar os métodos básicos da pilha:
◦ push(Pagina p) → adiciona uma nova página.
◦ pop() → remove a página atual.
◦ peek() → mostra a página atual .
◦ isEmpty() → verifica se a pilha está vazia.*/

public class PilhaPaginas {

	ArrayList<Pagina> pagina = new ArrayList<Pagina>();

	public void push(Pagina p) {
		
		pagina.add(p);
		
	}
	
	public Pagina pop() {
		
		Pagina topo;
		
		topo = pagina.get(pagina.size()-1);
		
		pagina.remove(pagina.size()-1);
		
		return topo;
	}
	
	public Pagina peek() {
		
		Pagina topo;
		
		topo = pagina.get(pagina.size()-1);
		
		return topo;
		
	}
	
	public boolean isEmpty() {
		
		return pagina.isEmpty();
		
	}
	
}

