package Simple_examples;
import java.util.Scanner;

public class RandomDice {
    public static void roll() {
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
        /*
        System.out.println("Der würfel wurde " + anzahlWurf + " Mal gewürfelt.");
        System.out.println("Dabei wurde: ");
        System.out.println("Die Zahl 1 wurde: " + zahl_1 + " gewürfelt.");
        System.out.println("Die Zahl 2 wurde: " + zahl_2 + " gewürfelt.");
        System.out.println("Die Zahl 3 wurde: " + zahl_3 + " gewürfelt.");
        System.out.println("Die Zahl 4 wurde: " + zahl_4 + " gewürfelt.");
        System.out.println("Die Zahl 5 wurde: " + zahl_5 + " gewürfelt.");
        System.out.println("Die Zahl 6 wurde: " + zahl_6 + " gewürfelt.");
         */

        System.out.printf("Ich habe %d gewürfelt, dabei%n", anzahlWurf);
        int [] heufigkeit = {zahl_1, zahl_2, zahl_3, zahl_4, zahl_5, zahl_6};
        int leange = heufigkeit.length;
        for ( int i = 0; i < heufigkeit.length; i++)
            System.out.printf( "Die: %d wurde %s Mal gewürfelt%n", i + 1, heufigkeit[ i ]);

    }


}
