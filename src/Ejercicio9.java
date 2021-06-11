import java.util.Scanner;

public class Ejercicio9{

    public static void main(String[] args){
        Ejercicio9 t = new Ejercicio9();
    }

    int [][] matrizUno = new int[3][3];
    int [][] matrizDos = new int[3][3];
    int [][] matrizSuma = new int[3][3];


    public Ejercicio9(){
        mostrarMatriz();

    }


    public void pirmerMatriz(){
        System.out.println("\n-- Primera Matriz --\n");

        for(int i = 0; i < matrizUno.length; i++){
            for(int j = 0; j < matrizUno.length; j++){
                matrizUno[i][j] = (int)(Math.random()*20+1);
                System.out.print("[ " + matrizUno[i][j] + " ]");
            }
            System.out.println("\n");
        }
    }

    public void segundaMatriz(){
        System.out.println("\n-- Segunda Matriz --\n");
        for(int i = 0; i < matrizDos.length; i++){
            for(int j = 0; j < matrizDos.length; j++){
                matrizDos[i][j] = (int)(Math.random()*20+1);
                System.out.print("[ " + matrizDos[i][j] + " ]");
            }
            System.out.println("\n");
        }
    }
        


    public void sumaMatriz(){
        System.out.println("\n-- Suma de Matrices  --\n");

        for(int i = 0; i < matrizUno.length; i++){
            for(int j = 0; j < matrizDos.length; j++){
                matrizSuma[i][j] = matrizUno[i][j] + matrizDos[i][j];
                System.out.print("[ " + matrizSuma[i][j] + " ]");
            }
            System.out.println("\n");
        }
    }

    public void mostrarMatriz(){

        pirmerMatriz();

        segundaMatriz(); 

        sumaMatriz();
        System.out.println("");

    }

}