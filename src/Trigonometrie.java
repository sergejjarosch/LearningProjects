import static java.lang.Math.asin;
import static java.lang.Math.sqrt;

public class Trigonometrie {

    double a = 5;
    double b = 3;
    double c = 1;
    // Hilfsparameter
    double alpha;
    //logische Variable -
    boolean state;
    //Werte der Hilfsvariablen

    public Trigonometrie() {

        alpha = asin( a / Math.sqrt( a * a + b * b));
// Berechnung der Kriterien
        state = a * a + b * b  >= c * c;
    }
    //Ausgabe
    public void TrGleichung (){
        System.out.println("Steuerung a cos(X) + b * sin(x) = C");
        System.out.println("Parameter: ");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c =  " +c);
        System.out.println("Lösung für x :" );
        // Berechnung der Gleichung:
        System.out.println(state? asin( c / sqrt( a * a + b * b)) -alpha: " Keine Lösung!");
    }
}
