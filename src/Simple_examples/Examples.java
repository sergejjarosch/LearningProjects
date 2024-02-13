package Simple_examples;

import java.sql.SQLOutput;
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

    // Random würfel _______________________________
    public static void RandomNumber() {

        int zahl_1 = 0;
        int zahl_2 = 0;
        int zahl_3 = 0;
        int zahl_4 = 0;
        int zahl_5 = 0;
        int zahl_6 = 0;

        int wuerfel;

        System.out.println("Wiviel mal soll ich würfeln? ");
        int anzahlWurf = new Scanner(System.in).nextInt();
        for (int i = 0; i < anzahlWurf; i++ ) {
            wuerfel = (int) (Math.random() * 6 +1);
            switch ( wuerfel ) {
                case 1 -> zahl_1++;
                case 2 -> zahl_2++;
                case 3 -> zahl_3++;
                case 4 -> zahl_4++;
                case 5 -> zahl_5++;
                case 6 -> zahl_6++;
            }
        }
        System.out.println("Der würfel wurde " + anzahlWurf + " Mal gewürfelt.");
        System.out.println("Dabei wurde: ");
        System.out.println("Die Zahl 1 wurde: " + zahl_1 + " gewürfelt.");
        System.out.println("Die Zahl 2 wurde: " + zahl_2 + " gewürfelt.");
        System.out.println("Die Zahl 3 wurde: " + zahl_3 + " gewürfelt.");
        System.out.println("Die Zahl 4 wurde: " + zahl_4 + " gewürfelt.");
        System.out.println("Die Zahl 5 wurde: " + zahl_5 + " gewürfelt.");
        System.out.println("Die Zahl 6 wurde: " + zahl_6 + " gewürfelt.");
    }

}
