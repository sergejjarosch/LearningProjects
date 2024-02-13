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


    public static void RandomNumber() {


    }

}
