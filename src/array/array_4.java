package array;
import java.util.Scanner;

public class array_4 {

    public static void array_4_output() {
        String [] validInputs = {"Banana", "Apple", "Cherry"};

        String input = null;
        boolean found = false;
        while ( ! found ) {
            input = new Scanner(System.in).nextLine();

            for ( String s : validInputs )
                if ( s.equalsIgnoreCase( input) ) {
                    found = true;
                    break;
                }
        }
        System.out.println("Yummy " + input);
    }
}
