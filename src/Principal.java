
public class Principal {

	public static void main(String[] args) {
		// Josue Petrucci RA:21708452
		BDSimulado bd = new BDSimulado();
		
		System.out.println(bd.getInfoCliente("Evandro da Silva"));
		System.out.println(bd.ligacoesPorCliente("Evandro da Silva"));
		System.out.println(bd.ligacoesPorUF("DF"));
		System.out.println(bd.ligacoesUFDiferente());
		System.out.println(bd.getInfoContaPagar("Evandro da Silva"));
		

	}

}
