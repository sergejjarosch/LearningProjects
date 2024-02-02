package conditions;

public class listing_211 {
    public void out_211 () {
        int sum = 0, i = 1, n = 100;

        while ( i <= n ){
            sum += i;
            i += 2;
        }
        System.out.println(" Die Summe der ungeraden Zahlen von 1 bis" + n +
                            ": " + sum);
    }

    // Fußgesteurte Schleife
    public void out_212 () {
        int sum = 0, i = 1, n = 100;
        do {
            sum += i;
            i += 2;
        } while ( i <= n );
        System.out.println(" Die Summe der geraden Zahlen von 1 bis" + n +
                ": " + sum);
    }
}
