package q1;

public class PalavraoException extends Exception {
	private static final long serialVersionUID = 1L;

	public PalavraoException(String palavrao) {
		super("Sua frase inapropriada tem o palavrao " + palavrao);
	}
}
