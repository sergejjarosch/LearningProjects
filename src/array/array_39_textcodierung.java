package array;
import java.util.Scanner;
public class array_39_textcodierung {
    public void array_39_textcodierung_out () {
        Scanner input = new Scanner(System.in);
        System.out.print(" Text zum Codieren: ");
        // Text auslesen:
        String text = input.nextLine();
        // Text wandeln in Array:
        char[] symbs = text.toCharArray();
        // Symbole Codieren:
        for ( int k = 0; k < symbs.length; k++) {
            symbs[k] = ( char ) (symbs[k] + k + 1 );
        }
        // Text erstellen auf Array basis:
        text = new String(symbs);
        System.out.println("Nach dem Codieren: ");
        // Codierter Text:
        System.out.println(text);
       /* Mit dem Codierten Text
       Array erstellen*/
        symbs = text.toCharArray();
        // Text decodieren:
        for (int k = 0; k < symbs.length; k++){
            symbs[k] = (char)(symbs[k] - k - 1);
        }
        // Mit Array Text erstellen:
        text = new String(symbs);
        System.out.println("Nach dem Decodieren: ");
        // Decodierter Text:
        System.out.println(text);
    }
}
