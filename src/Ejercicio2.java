import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){
        Ejercicio2 t = new Ejercicio2();
    }

    int[] elementos = new int[10];
    int random;
    int mayor;
    int contador = 0;
  

    public Ejercicio2(){

        generarDato();
    }


    public void generarDato(){
        for(int i = 0 ; i < elementos.length ; i++){
             random = (int)(Math.random()*(99-0)+0);
             elementos[i] = random;
             System.out.println("El indice es "+ (i+1) + " el valor es: "+ elementos[i]);
             compararDato(random);

        }
            repeticionesMayor();
            System.out.println("El número mayor es = " + mayor);
            System.out.println("Las veces que se repite " + mayor + " es = " + contador);
    } 
    public void compararDato(int random){
        if(random > mayor){
        mayor = random;
        }

    }
    public void repeticionesMayor(){
        for(int i = 0  ; i < elementos.length; i++){
            if(mayor == elementos[i]){
                contador++;
            }
        }
    }
}