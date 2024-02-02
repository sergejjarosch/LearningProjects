package conditions;

import java.util.Scanner;
public class listing_2_4_switch {
   Scanner input = new Scanner(System.in);
   String name, txt;

   public void sout_switch() {
       System.out.println("Gib bitte dein Name ein: ");
       name = input.nextLine();

       switch (name) {
           case "Duck" :
               txt = " Meinst du Donald " + name + "?";
               break;
           case "Goofy":
               txt = name + " ist ein Hund";
               break;
           case "Micky":
               txt = name + "ist eine Maus";
               break;
           default:
               txt = " Wer ist es?";
       }
       System.out.println(txt);
   }

}
