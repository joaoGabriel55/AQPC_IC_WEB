package model;

public class Preparacao {
	private String nome;
	
	private double cor;
	
	private double tecnicaCoccao;
	
	private double sobremesa;
	
	private double folhosos;
	
	private double enxofre;
	
	private double aspectoGorduroso;
	
	public Preparacao() {
		super();
	}

	public Preparacao(String nome, double cor, double tecnicaCoccao, double sobremesa, double folhosos, double enxofre,
			double aspectoGorduroso) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.tecnicaCoccao = tecnicaCoccao;
		this.sobremesa = sobremesa;
		this.folhosos = folhosos;
		this.enxofre = enxofre;
		this.aspectoGorduroso = aspectoGorduroso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCor() {
		return cor;
	}

	public void setCor(double cor) {
		this.cor = cor;
	}

	public double getTecnicaCoccao() {
		return tecnicaCoccao;
	}

	public void setTecnicaCoccao(double tecnicaCoccao) {
		this.tecnicaCoccao = tecnicaCoccao;
	}

	public double getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(double sobremesa) {
		this.sobremesa = sobremesa;
	}

	public double getFolhosos() {
		return folhosos;
	}

	public void setFolhosos(double folhosos) {
		this.folhosos = folhosos;
	}

	public double getEnxofre() {
		return enxofre;
	}

	public void setEnxofre(double enxofre) {
		this.enxofre = enxofre;
	}

	public double getAspectoGorduroso() {
		return aspectoGorduroso;
	}

	public void setAspectoGorduroso(double aspectoGorduroso) {
		this.aspectoGorduroso = aspectoGorduroso;
	}
}
