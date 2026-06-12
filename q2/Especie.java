package q2;

public final class Especie extends Organismo implements DescritorBiologico{

	public Especie(String nomeP, String nomeC) {
		super(nomeP, nomeC);
	}

	@Override
	public String descrever() {
		return String.format("Popular: %s , Cientifico: %s", this.nomePopular, this.nomeCientifico);
	}
	
}
