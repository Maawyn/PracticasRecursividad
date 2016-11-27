package ejercicios;

import java.util.Scanner;

public class EjercicioX {

	static String[] palabras = {};
	static String[] auxiliar;
	
	public static void main(String[] args) {
		introducirPalabra();	
	}
	
	private static void introducirPalabra(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra");
		String palabra = sc.nextLine() ;
		
		if(palabra.toUpperCase().charAt(0) == 'Q' && palabra.length() == 1){
			sc.close();
			return;
		}else{
		aniadirPalabra(palabra);
		sc.close();
		}
		
	}
	
	private static void aniadirPalabra(String palabra){
		auxiliar = new String[palabras.length + 1];

		recorrerPalabras(0);
		
		auxiliar[palabras.length] = palabra;
		palabras = auxiliar;
		
		pintarPalabras(0);
		
		introducirPalabra();
	}
	
	private static void pintarPalabras(int posicion){
		if(posicion == palabras.length - 1){
			System.out.println(palabras[posicion]);
			return;
		}else{
			System.out.print(palabras[posicion] + ", ");
			pintarPalabras(posicion+1);
		}
	}
	
	private static void recorrerPalabras(int posicion){
		if(posicion == palabras.length){
			return;
		}
		
		auxiliar[posicion] = palabras[posicion];
		
		recorrerPalabras(posicion + 1);
	}

}