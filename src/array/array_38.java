package array;
import java.util.*;
public class array_38 {
    public void arra_38_output () {
        Scanner input = new Scanner(System.in);
        // Array Variablen
        char[] A, B;
        // Text auslesen
        System.out.println("Erstes Array: ");
        A = input.nextLine().toCharArray();
        System.out.println("Zweites Array: ");
        B = input.nextLine().toCharArray();
        // Zeigt den Array Inhalt an:
        System.out.println("A= " + Arrays.toString(A));
        System.out.println("B= " + Arrays.toString(B));
        // Vergleich der Variblen aus Array
        System.out.println("Array Variblen: ");
        if ( A == B) System.out.println(" A==B");
        else System.out.println(" A!=B");
        // Array Vergleich
        System.out.println("Array Vergleich: ");
        boolean state = true;
        if (A.length != B.length) {
            state = false;
        } else {
            for ( int k = 0; k < A.length; k++){
                if (A[k] != B[k]) {
                    state = false;
                    break;
                }
            }
        }
        // Vergleich Ergebnisse:
        if (state) System.out.println(" A==B ");
        else System.out.println(" A!=B ");
    }

}
