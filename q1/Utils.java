package q1;
import java.util.ArrayList;

public class Utils {
	public static void moderar(String frase) throws PalavraoException {
		ArrayList<String> palavroesList = Utilidades.getPalavroes();
		
		String textToAnalise = frase.toLowerCase();
		
		for(String palavra : palavroesList) {
			if(textToAnalise.contains(palavra.toLowerCase())) {
				throw new PalavraoException(palavra);
			}
		}
		
	}
}
