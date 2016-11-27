//Implementa un programa recursivo que multiplique todos los dígitos de un número leído por
//teclado.

package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numUsuario = sc.nextInt();
		int resultado = 1;
		resultado = multiplicar(numUsuario, resultado);
		System.out.println(resultado);
		sc.close();
	}
	
	public static int separar(int num){
		if(num < 10){
			return num;
		}else{
			return num%10;
		}
	}
	
	public static int multiplicar (int num, int resultado){
		resultado *= separar(num);
		if(num >= 10){
			resultado = multiplicar(num/10, resultado);
		}
		
		return resultado;
	}
}
