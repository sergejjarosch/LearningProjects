package conditions;

public class for_2_7 {
    // Variable für die ermittlung
    // obere Grenze

    public void output_27(){
        int sum = 0, n = 100;
        // Operator des Intervalls
        for( int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Die Summe der geraden Zahlen ist von: 1 bis: " + n + ": " + sum);
    }

}
