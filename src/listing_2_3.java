import java.util.Scanner;
public class listing_2_3 {
    // create object scanner
    int a;

    public listing_2_3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein: ");
        a = input.nextInt();
    }
    public void Sout_2_3(){
        if ( a == 0 ) { // wen eine 0 eingegeben ist
            System.out.println(" Es ist eine:" + a);
        } else if ( a == 1) { // wenn eine 1 eingegeben ist
            System.out.println(" Sie haben die: " + a + "eingegeben");
        } else if (a % 2 == 0) {// wenn eine gerade Zahl eingegeben ist
            System.out.println("Sie haben eine gerade Zahl eingegeben: " + a);
        }  else { // sonnst
            System.out.println("Sie haben eine ungerade Zahl eingegeben: " + a);
        }
        System.out.println("Danke!");
    }


}
