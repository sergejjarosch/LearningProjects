
package conditions;

public class for_2_6 {
    // Index - Bezugsvariable
    int i, n = 100;

    // Variable um den wert zu Speichern
    int sum = 0;

    public void for_2_6(){
        for ( i = 1 ; i <= n ; i++){
            sum += i;
        }
        System.out.println( "Summe der Zahlen, von 1 bis " + n + ": " + sum);
    }
}
