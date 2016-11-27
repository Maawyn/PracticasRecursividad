//Implementa un programa recursivo que invierta un n�mero entero le�do por teclado. Por
//ejemplo, si leemos el n�mero 28314, la salida deber�a ser 41382.
package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int numUsuario = sc.nextInt();
		inversor(numUsuario);
		sc.close();
	}
	
	public static void inversor(int num){
		if((num < 10)&&(num > 0)){
			System.out.print(num);
		}
		if(num>10){
			System.out.print(num%10);
			inversor(num/10);
		}
	}
}
