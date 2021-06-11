import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){
        Ejercicio6 t = new Ejercicio6();
    }

    int[][] elementos = {{5,6,13},{14,2,4},{21,7,6}};

    public Ejercicio6(){
        originMatriz();
        multiMatriz();

    }

        public void originMatriz(){
            System.out.println(" Matriz Original \n");
            for(int j = 0; j < elementos.length; j++){
                for(int i = 0; i < elementos[j].length; i++){
                    elementos[j][i] *=1;
                    System.out.print(" [" + elementos[j][i] + "] ");
                }
                System.out.println("\n");
            }
        }


        public void multiMatriz(){
            System.out.println("Matriz Multiplicada por Dos \n");
            for(int j = 0; j < elementos.length; j++){
                for(int i = 0; i < elementos[j].length; i++){
                    elementos[j][i] *= 2;
                    System.out.print(" [" + elementos[j][i] + "] ");
                }
                System.out.println("\n");
            }
        }
    }