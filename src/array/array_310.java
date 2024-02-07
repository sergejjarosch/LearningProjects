package array;
import java.util.Arrays;
public class array_310 {
    public void array_310_output (){
        // Arrays für die Umsetzung der Skalarproduktes
        double[] a = {1, 2, -1};
        double[] b = {3, -1, 2};
        double[] c = new double[3];
        // Variable für Einschreiben des Skalarproduktes
        double s = 0;
        // Ermittlung für Vektor und Skalarprodukt
        for ( int k = 0; k < 3 ; k++) {
            s += a[k] * b [k];
            c[k] = a [(k+1) %3] *b [(k+2) %3] -a [(k+2)%3] *b [(k+1) %3];
        }
        // Ergebniss Output:
        System.out.println("a= " + Arrays.toString(a));
        System.out.println("b= " + Arrays.toString(b));
        System.out.println("a.b= " +s);
        System.out.println("s= [a.b] = " + Arrays.toString(c));

    }
}
