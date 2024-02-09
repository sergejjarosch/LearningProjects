package Simple_examples;

public class GuessRight {

    static int versuch = 0;
    public void GuessRight_output(){

        int number = (int) (Math.random() * 5 + 1);
        while ( true ) {
            System.out.println("What number between 1 and 5 do I have in mind?" );
            int guess = new java.util.Scanner(System.in).nextInt();

            if (guess < 1 || guess > 5  ) {
                ++versuch;
                System.out.println("Only number between 1 and 5!");
                continue;
            }

            if ( number == guess ) {
                ++versuch;
                System.out.println( "Good guess!" + "Du hast " + versuch + " Versuche gebraucht.");
                break;
            }
            else if ( number > guess ){
                ++versuch;
                System.out.println( "Nope, my number is larger than yours!" );
            }
            else if ( number < guess ) {
                ++versuch;
                System.out.println( "Nope, my number is smaller than yours!");
                }
        }
    }
}
