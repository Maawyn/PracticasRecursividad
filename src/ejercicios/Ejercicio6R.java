//Implementa un programa recursivo que calcule la representaci�n binaria de un n�mero decimal
//le�do por teclado. Para ello, habr� que realizar divisiones sucesivas del n�mero entre 2 hasta
//que el cociente sea 0. En ese punto, la representaci�n binaria ser�n los restos obtenidos de
//manera inversa. Por ejemplo, para la representaci�n del 35 en binario:
//35 / 2 = 17 --> Resto: 1
//17 / 2 = 8 --> Resto: 1
//8 / 2 = 4 --> Resto: 0
//4 / 2 = 2 --> Resto: 0
//2 / 2 = 1 --> Resto: 0
//1 / 2 = 0 --> Resto: 1
//Recuperamos los restos de manera inversa, resultando en 100011, que es la representaci�n
//binaria del decimal 35.
package ejercicios;

import java.util.Scanner;

public class Ejercicio6R {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt();
		System.out.println(division(num));
		sc.close();
	}
	
	public static String division(int num){
		int resto;
		if(num/2 == 0){ //caso base
			return "1";
		}else{
			resto = num%2;
			return division(num/2) + resto;
		}
	}
	
}
