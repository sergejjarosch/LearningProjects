package array;

public class array_311 {
    public void array_311_out () {
        // Array Größe
        int n = 15;
        // Array für Fibonachi Zahlen:
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
