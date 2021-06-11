package src;
import java.util.Scanner;

public class Ejercicio7{

    public static void main(String[] args){
        Ejercicio7 t = new Ejercicio7();
    }

    int [][] elementos = new int[4][3];
    int suma;

    public Ejercicio7(){
        generarMatriz();
        sumaPar();

    }

    public void generarMatriz(){

        for(int j = 0; j < elementos.length; j++){
            for(int i = 0; i < elementos[j].length; i++){
                elementos[j][i] = (int) (Math.random()*555);
                System.out.print(" [" + elementos[j][i] + "] ");
             }
            System.out.println("\n");
        }
    }

    public void sumaPar(){
        for(int j = 0; j < elementos.length; j++){
            if((j+1) % 2 == 0){
                for(int i = 0; i < elementos[j].length; i++){
                    suma += elementos[j][i];
                }

            }
        }
        System.out.println("La suma total de las filas pares es = " + suma);
    }


}