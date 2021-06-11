package src;
import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){
        Ejercicio4 t = new Ejercicio4();
    }

    int[] elementos = new int[10];
    int random;
    int mayor;
    int resta;
  

    public Ejercicio4(){

           generarDato();
        }


    public void generarDato(){
        for(int i = 0 ; i < elementos.length ; i++){
             random = (int)(Math.random()*(99-0)+0);
             elementos[i] = random;
             System.out.println("El indice es "+ (i+1) + " el valor es: "+ elementos[i]);
             compararDato(random);
             
        }
            System.out.println("El número mayor es = " + mayor);
            diferenciasMayor();
            
            
    } 
    public void compararDato(int random){
        if(random > mayor){
        mayor = random;
        }

    }
    public void diferenciasMayor(){
        for(int i = 0  ; i < elementos.length; i++){
            resta = mayor - elementos[i];
            System.out.println("La resta de " + mayor + " - " + elementos[i] + " es = " + resta);
        }
        

    }
}