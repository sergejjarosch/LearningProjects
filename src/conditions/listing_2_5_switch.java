package conditions;

import java.util.Scanner;
public class listing_2_5_switch {
    Scanner input = new Scanner(System.in);
    String name, txt;

    // methode
    public void sout_2_5() {
        System.out.println("Geben Sie den Namen ein: ");
        name = input.nextLine();

        switch (name){
            case "morse":
            case "pate":
                txt = "Erfinder " + name;
                break;
            case "Alpha":
            case "Bravo":
            case "Charley":
                txt = name + " ist im NATO Alphabet";
                break;
            case "Delta":
            case "Ecko":
                txt = " ist auch aus dem NATO Alphabet";
                break;
            default:
                txt = " Die Eingabe ist unbekannt";
        }
        System.out.println(txt);
    }
}
