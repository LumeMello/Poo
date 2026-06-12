package q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		HashMap<String, DescritorBiologico> hm = new HashMap<String, DescritorBiologico>();
		Scanner sc = new Scanner(System.in);
		
		Especie cao = new Especie("cão", "Canis Familiaris");
		
		hm.put(cao.getNomePopular(), cao);
		
		Especie lobo = new Especie("lobo", "Canis Lupus");
		
		hm.put(lobo.getNomePopular(), lobo);
		
		Especie gato = new Especie("gato", "Felis Catus");
		
		hm.put(gato.getNomePopular(), gato);
		String entry = sc.nextLine();
		
		boolean  b = check(entry,hm);
		
		if(!b) {
			System.out.println("Não encontrada");
		}
		
		sc.close();
	}
	
	public static boolean check(String entry, HashMap<String, DescritorBiologico> hm) {
		
		ArrayList<String> list = new ArrayList<>(hm.keySet());
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			if(entry.equals(itr.next())) {
				System.out.println(hm.get(entry).descrever());
				return true;
			}
		}
		
		return false;
	}

}
