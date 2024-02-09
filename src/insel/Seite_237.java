package insel;
import java.util.Scanner;

public class Seite_237 {

    private static int A;
    private static int B;

    static int zahl_a = A;
    static int zahl_b = B;

    public static void printMax (){
        System.out.print("Gib eine Zahl zum vergleich ein: ");
        zahl_a = new java.util.Scanner( System.in ).nextInt();
        System.out.print("Und neoch eine hier: ");
        zahl_b = new java.util.Scanner( System.in ).nextInt();
        if ( zahl_a > zahl_b)
            System.out.println("Zahl " + zahl_a + " ist Größer." );
        else
            System.out.println("Zahl " + zahl_b + " ist Größer " );
        }


}
