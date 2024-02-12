package Simple_examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Examples {
    public void example_output() {
    // Sleepy-Operator
          int i = 20;
          System.out.println( i -=-i );
        }
    public static void printCurrentDate () {
        DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(LocalDate.now().format( fmt ));
    }
    public static void RandomNumber() {
        int n;
        System.out.println("Wiviel mal soll ich würfeln? ");
        int anzahlWurf = new Scanner(System.in).nextInt();
        for (int i = 0; i < anzahlWurf; i++ ) {
            n = (int) (Math.random() * 6 +1);
            System.out.println(n);


        }
        int gesamtzahl;



    }

}
