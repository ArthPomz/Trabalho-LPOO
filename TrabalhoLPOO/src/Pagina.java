


/*Classe Pagina
• Deve conter, no mínimo, os atributos:
◦ String url
◦ String titulo
• Construtor e métodos get/set.
• Método toString() para exibir os dados de forma legível.*/

public class Pagina {
	
	private String url;
	private String titulo;
	
	/*construtor*/
	
	public Pagina (String url, String titulo) {
		
		this.url = url;
		this.titulo = titulo;
		
	}
	
	/*getters e setters*/
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/*toString*/
	
	@Override
	public String toString () {
		return "Url [ " + url + " ] " + '\n' + "Título [ " + titulo + "]";
	}
	
	
}
