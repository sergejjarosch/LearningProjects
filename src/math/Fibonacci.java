package math;

public class Fibonacci {
    // Anzahl der Zahlen in folge
    // Anfangswerte

    public void fibonacci_out() {
        int n = 15, a = 1, b = 1, i;
        System.out.println("Fibonacci Zahlen: ");
        // console output
        System.out.print( a + " " + b);
        // Errmittling der Fibonacci Zahlen
        for ( i = 3; i <= n; i ++) {
            b = a + b;
            a = b - a;
            System.out.print(" " + b);
        }
    }


}
