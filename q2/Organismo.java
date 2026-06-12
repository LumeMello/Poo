package q2;

public abstract class Organismo {
	protected String nomePopular;
	protected String nomeCientifico;
	
	public Organismo(String nomeP, String nomeC) {
		this.nomePopular = nomeP;
		this.nomeCientifico = nomeC;
	}
	
	public String getNomePopular() {
		return this.nomePopular;
	}
	public String getNomeCientifico() {
		return this.nomeCientifico;
	}
	
	public void setNomePopular(String newName) {
		this.nomePopular = newName;
	}
	public void setNomeCientifico(String newName) {
		this.nomeCientifico = newName;
	}
}
