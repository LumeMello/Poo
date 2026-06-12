package q3;

public class Lago {
	private String nome;
	public int profundidade;
	public static int totalLagos;
	public Lago() {
		profundidade++;
		totalLagos++;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
