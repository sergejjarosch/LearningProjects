package math;

public class exponent {
    // Obere grenze der Summe und Index Variante
     public void exponet_out () {
         int n = 100, k;

         double x = 1, s = 0, q = 1;

         for ( k = 0 ; k <= n ; k ++ ) {
             s += q;
             q *= x / ( k + 1 );
         }
         // Ergebniss
         System.out.println("exp(" + x + ") = " +s );
     }
}
