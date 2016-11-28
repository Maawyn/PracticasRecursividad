package ejercicio;

public class E1 {
	
	static String[] listaA = {"a","b","c","d"};
	static String[] listaB = {"a","b","c","d"};

	public static void main(String[] args) {	
		boolean iguales = false;
		System.out.println("Este programa va a calcular si estas dos listas son iguales");
		System.out.println("¿Estas dos listas son iguales?" + siIguales(0,iguales));
	}
	
	public static boolean siIguales(int posicion, boolean iguales){	
		if(listaA[posicion] != listaB[posicion]){
			return false;
		}
		if((posicion == listaB.length-1) && (listaA[posicion]==listaB[posicion])){// caso base
			iguales = true;
		}
		if(listaA[posicion] == listaB[posicion] && posicion != listaB.length-1){
			iguales = siIguales(posicion+1, iguales);	
		}
		return iguales;
	}		

}

