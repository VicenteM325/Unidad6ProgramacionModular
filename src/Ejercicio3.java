package src;
import java.util.*;

public class Ejercicio3{
	public static void main(String[] args) {
		System.out.println("*****Ejercicio3*****");
		Ejercicio3 t = new Ejercicio3();
	}

	int[] elementos = new int[8];
	int numero;
	int buscar;
	Scanner scanner = new Scanner(System.in);

	public Ejercicio3(){
		pedirdato(numero);
	}

	public void pedirdato(int numero){
		for(int i = 0; i<8; i++){
			System.out.println("Ingrese el valor No"+(elementos[numero]+1)+":");
		    elementos[numero] = scanner.nextInt();
		}

		buscarnumero(elementos[numero]);
		if(buscar== numero){
			System.out.println("Verdadero");
		}
		if(buscar!=numero){
			System.out.println("Falso");
		}
	}

	public void buscarnumero(int buscar){
		System.out.print("Ingrese un numero a buscar: ");
		buscar = scanner.nextInt();

	}
}