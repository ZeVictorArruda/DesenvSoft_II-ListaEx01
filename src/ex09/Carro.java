package ex09;

public class Carro {
	private int codigo, diasLocal;
	private String nome;
	private double preco, valorLocacao, valorTotal;
	public static final String tipo = "Sedan";
	public static final String marca = "FIAT";
	
	
	public Carro(int codigo, int diasLocal, String nome, double preco, double valorLocacao) {
		this.codigo = codigo;
		this.diasLocal = diasLocal;
		this.nome = nome;
		this.preco = preco;
		this.valorLocacao = valorLocacao;
		this.valorTotal = diasLocal * valorLocacao;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getDiasLocal() {
		return diasLocal;
	}


	public void setDiasLocal(int diasLocal) {
		this.diasLocal = diasLocal;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getValorLocacao() {
		return valorLocacao;
	}


	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public static String getTipo() {
		return tipo;
	}


	public static String getMarca() {
		return marca;
	}
	
	

}
