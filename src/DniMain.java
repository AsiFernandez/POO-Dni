
public class DniMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DNI nif = new DNI();
		String numeracionGuardar = nif.leerNumero();
		nif.setNumero(numeracionGuardar);
		
		char letraGuardar = nif.obtenerLetra(numeracionGuardar);
		nif.setLetra(letraGuardar);
		
		System.out.println(nif.toString());
	}

}
