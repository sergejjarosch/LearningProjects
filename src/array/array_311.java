package array;
import java.util.Scanner;
public class array_311 {


    public void array_311_out () {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die gewünschte Mänge der Fibonacci Zahlen: ");
        // Array Größe
        int n = input.nextInt();
        // Array für Fibonachi Zahlen, Mänge der zu erstellenden Zahlen:
        int[] Fib = new int [n];
        // Ersten zwei Zahle der Reihe:
        Fib[0] = 1;
        Fib[1] = 1;
        // Anzeige erste zwei Werte:
        System.out.print( Fib[0] + " " + Fib[1]);
        // Reihenfolge ermitteln und Ergebniss Anzeige:
        for ( int k = 2; k < n; k++){
            // Werte ermitteln für den Array:
            Fib[k] = Fib[k-1] + Fib[k -2];
            // Anzeige der Werte:
            System.out.print(" " + Fib[k]);
        }
    }
}
