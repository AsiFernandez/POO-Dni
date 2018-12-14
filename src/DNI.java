import java.util.Scanner;

public class DNI {

	/*
	 * ATRIBUTOS
	 */
	private String numero;
	private char letra;
	
	
	/*
	 * GETTERS Y SETTERS
	 */
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	/*
	 * CONSTRUCTOR
	 */
	
	public DNI() {
		
	}
	
	/*
	 * METODOS
	 */
	public static Scanner scan = new Scanner(System.in);
	
	
	public String leerNumero() {
		
		String numeracion;
		
		System.out.println("Introduce el numero de tu dni de 8 cifras");
		numeracion = scan.next();
		
	
		return numeracion;
	}
	
	public char obtenerLetra(String  numero) {
		
		char letrasDni[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; 
		char letraObtenida  = 'A';
		int numeroDeLetra;
		
		numeroDeLetra = Integer.parseInt(numero) % 23;
		
		letraObtenida = letrasDni[numeroDeLetra];
		
		return letraObtenida;
		
	}
	
	public String toString() {
		return "DNI de la persona: "+ numero + "-" + letra;
	}
	
	
	
	
	
	
	
}
