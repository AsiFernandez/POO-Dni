import java.util.Scanner;

public class DNI {

	/*
	 * ATRIBUTOS
	 */
	private int numero;
	private char letra;
	
	
	/*
	 * GETTERS Y SETTERS
	 */
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numeracionGuardar) {
		this.numero = numeracionGuardar;
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
	
	//Metodos finales, scanner en este caso
	public static Scanner scan = new Scanner(System.in);
	
	
	//metodo para leer el numero del dni 
	public int leerNumero() {
		
		System.out.println("Introduce el numero del dni");
		 numero = scan.nextInt();
		
		letra = obtenerLetra(numero);
		
		return numero;
	}
	
	private char obtenerLetra(int numero) {
				char letrasDni[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; 
		
		return letrasDni[numero%23];
		
	}
	
	public String toString() {
		return "DNI de la persona: "+ numero + "-" + letra;
	}
	
	
	
	
	
	
	
}
