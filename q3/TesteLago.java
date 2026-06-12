package q3;

public class TesteLago {
	public static void main(String[] args) {
		Lago l1 = new Lago();
		l1.setNome("Titicaca");
		Lago l2 = new Lago();
		Lago l3 = new Lago();
		l2.setNome("Baikal");
		modificar(l1,l2);
		System.out.println(l1.getNome());
		System.out.println(l2.getNome());
		
		int y = 50;
		l1.profundidade = 20;
		l1.profundidade = l2.profundidade;
		System.out.println(y);
		atualizar(l1.profundidade,y,l1);
		
		System.out.println(l1.getNome());
		System.out.println(y);
		System.out.println(l1.profundidade);
		System.out.println(Lago.totalLagos);
		
		l3 = criarNovo(l2);
		l3.setNome("Vostok");
		System.out.println(l2.getNome());
		

	}

	private static Lago criarNovo(Lago lago) {
		lago = new Lago();
		lago.setNome("Victoria");
		return lago;
	}

	private static void atualizar(int x, int z, Lago lago) {
		z=99;
		x=120;
		lago.setNome("Malawi");
		lago = new Lago();
		lago.profundidade = 88;
		Lago.totalLagos = 999;
	}

	private static void modificar(Lago l2, Lago l1) {
		l1.setNome("Nasser");
		l1 = l2;
		l1.setNome("Tanganyika");
		l2 = l1;
		l2.setNome("Superior");
	}
}