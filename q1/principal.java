package q1;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) throws PalavraoException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma frase");
		String frase = sc.nextLine();
		
		Utils.moderar(frase);
		
		System.out.println("Frase apropriada");
		
		sc.close();
	}

}
