package math;

public class pi_number {
    // Grundmänge der linien in dem Gitter
    int n = 100000;
    // Indikator Variablen
    int i, j;
    // Zähler für die punkte, die in dem kreis gelandet sind
    long count = 0L;
    // Koordinaten der Punkte und die Zahl PI
    double x, y, Pi;
    // umzählung der Punkte

    public void pi_out () {
        for ( i = 0; i <= n; i ++ ) {
            for ( j = 0; j <= n; j++) {
                // Koordinaten der Punkte
                x = ( double ) i / n;
                y = ( double ) j / n;
                // wen der Punkt in den Kreis trift
                if(( x - 0.5 ) * ( x - 0.5 ) + (y - 0.5) * ( y - 0.5 ) <= 0.25) {
                    count ++ ;
                }
            }
        }
        // Die Zahl PI
        Pi = 4.0 * count / ( n + 1 ) / ( n + 1);
        // Ergebniss
        System.out.println("Ermitelltes Wert nach den Punkten: " + (long) (n + 1) * (n +1));
        System.out.println(Pi);
    }
}
