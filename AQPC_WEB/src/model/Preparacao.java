package model;

public class Preparacao {
	public enum Textura {
		PASTOSO, MACIO;
	}
	
	public enum Cor {
		VERMELHO, VERDE, BRANCO, AMARELO, PRETO, MARROM, LARANJA, ROXO;
	}
	
	public enum GrupoAlimento {
		DOCE, LEGUME, CARNE_VERMELHA, CARNE_AVE, CARNE_SUINA,FRUTA,INDUSTRIALIZADO,CEREAIS,VERDURAS,LEITE,SUCOS,HORTALICAS,GORDURAS,OLEOS,FRUTOS_MAR,
		OVOS,MISCELANEAS,NOZES,SEMENTES,PESCADOS;
	}
	
	public enum TecnicaCoccao {
		CONDUCAO,CONVCCAO,GRELHAR,ASSAR,GUISAR,BRASEAR,SALTEAR,CALOR_SECO,CALOR_UMIDO,FRITAR,REFOGAR,RADIACAO;
	}
	
	public enum AspectoGorduroso {
		GORDUROSO,MUITO_GORDUROSO,POUCO_GORDUROSO;
	}
	
	private String nome;
	private Textura textura; 
	private GrupoAlimento gpAlimento;
	private boolean vegetariano;
	private boolean enxofre;
	private AspectoGorduroso aspectoGorduroso;
	private TecnicaCoccao tecnicaCoccao;
	
	public Preparacao() {
		super();
	}
	
	public Preparacao(String nome, Textura textura, GrupoAlimento gpAlimento, boolean vegetariano,
			boolean enxofre, AspectoGorduroso aspectoGorduroso, TecnicaCoccao tecnicaCoccao) {
		super();
		this.nome = nome;

		this.textura = textura;
		this.gpAlimento = gpAlimento;
		this.vegetariano = vegetariano;
		this.enxofre = enxofre;
		this.aspectoGorduroso = aspectoGorduroso;
		this.tecnicaCoccao = tecnicaCoccao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Textura getTextura() {
		return textura;
	}
	public void setTextura(Textura textura) {
		this.textura = textura;
	}
	public GrupoAlimento getGpAlimento() {
		return gpAlimento;
	}
	public void setGpAlimento(GrupoAlimento gpAlimento) {
		this.gpAlimento = gpAlimento;
	}
	public boolean isVegetariano() {
		return vegetariano;
	}
	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
	public boolean isEnxofre() {
		return enxofre;
	}
	public void setEnxofre(boolean enxofre) {
		this.enxofre = enxofre;
	}
	public AspectoGorduroso getAspectoGorduroso() {
		return aspectoGorduroso;
	}
	public void setAspectoGorduroso(AspectoGorduroso aspectoGorduroso) {
		this.aspectoGorduroso = aspectoGorduroso;
	}
	public TecnicaCoccao getTecnicaCoacao() {
		return tecnicaCoccao;
	}
	public void setTecnicaCoccao(TecnicaCoccao tecnicaCoccao) {
		this.tecnicaCoccao = tecnicaCoccao;
	}
	
	
	
	
	
}
