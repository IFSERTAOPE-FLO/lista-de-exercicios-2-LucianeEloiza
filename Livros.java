

public class Livros {
	private String nomedolivro;
	private int codigo;
	private String autor;
	public String getNomedolivro() {
		return nomedolivro;
	}
	public void setNomedolivro(String nomedolivro) {
		this.nomedolivro = nomedolivro;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Livros(String nomedolivro, int codigo, String autor) {
		this.nomedolivro = nomedolivro;
		this.codigo = codigo;
		this.autor = autor;
	}
	
	 public void exibirLivro() {
		   System.out.println("nome: " +this.getNomedolivro()+ " Codigo: " +this.getCodigo()+ " Autor:  " +this.getAutor());
	
	 }
}