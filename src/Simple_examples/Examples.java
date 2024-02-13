package Simple_examples;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
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

    public static void dieErweiterteForSchleife (){
        for ( int weight : new int []{ 2, 3, 5, 7, 11} )
            System.out.print(weight);
        // sprung nächste Zeile
        System.out.println();

        for ( String name : new String[] {"Biene ", "Tiger ", "Elefant "})
            System.out.print( name );

        // ** Arrays.asList ** erzeugt kein Array als Rückgabe. Es baut eine Sammlung aus Variablen
        for ( String name : Arrays.asList("Butter ", "Sahne ", "Tomaten ", "Mehl " ))
            System.out.println( name );

    }
}
