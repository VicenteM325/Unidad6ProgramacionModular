package src;
import java.util.*;


public class Ejercicio1{

    public static void main(String[] args){

    Ejercicio1 t = new Ejercicio1();

    }

    int[] elementos = new int[5];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio1(){
        for(int i = 0 ; i<5; i++){
            pedirValor(i);
        }
        for(int i = 0 ; i<5; i++){
            mostrarDato(i);
        }

    }
    public void mostrarDato(int numero){
        System.out.println("\nEl indice es "+ (numero+1) + " el valor es: "+ (elementos[numero]+1)); 
    }

    public void pedirValor(int numero){
        System.out.print("\nIngres el valor No. "+ (numero+1) + ": ");
        elementos[numero] = scanner.nextInt();
    }
    
}