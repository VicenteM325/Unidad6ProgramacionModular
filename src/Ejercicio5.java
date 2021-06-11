import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){
        Ejercicio5 t = new Ejercicio5();
    }

    int[] elementos = new int[101];
    int random;
    int contador = 0, i =0;

    public Ejercicio5(){
        generarDato();

    }

    public void generarDato(){

        do{ 
             random = (int)(Math.random()*(10)+1);
             elementos[i] = random;
             System.out.print("\nindice "+ (i+1) + " Nota: "+ elementos[i]);
             i++;
            contador++;
            elementos[i+1] = -50; 
        }while(i < 100);

        double promedio = getPromedio();
        System.out.println("El promedio es "+ promedio);
            
    }
    public double getPromedio(){
    int total = 0;
    for(int i = 0; i<100; i++){
    total+=elementos[i];
    } 
    double promedio = (double)total/100;
     return promedio;

    }
}