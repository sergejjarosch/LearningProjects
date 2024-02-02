package conditions;

public class listing_28 {

    public void output_28 () {
        int sum, i , n;
        for (sum = 0, i = 1, n = 100; i <= n; sum += i, i += 2);
        System.out.println(" Die Summe der Geraden Zahlen von 1 bis " + n +
                ": " + sum);
    }

    public void output_29 () {
        int sum = 0, i = 1, n = 100;
        // Operator des Intervalls mit lehren Parametern
        for (;i <= n; ) {
            sum += i;
            i += 2;
        }
        System.out.println(" Die Summe der ungeraden Zahlen von 1 bis " +
                n + ": " + sum);
    }

    public void output_210 () {
        int sum = 0, i = 1, n = 100;
        for (;;) {
            sum += i;
            i += 2;
            // Interval wird beendet
            if ( i > n ) break;
        }
        System.out.println(" Die Summe der ungeraden Zahlen von 1 bis " +

                n + ": " + sum);
    }

}
