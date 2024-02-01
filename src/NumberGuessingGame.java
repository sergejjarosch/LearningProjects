import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.random;
public class NumberGuessingGame {

    int num, ans, icon;
    String txt;
    public NumberGuessingGame() {
// Random number from 1 to 5
        num = (int) (5 * random()) + 1;
    // Read whole number
    ans = parseInt( // Conversion from text to number
            showInputDialog( null, // Parent window
                    // Text above the input window
                    "Guess the number: from 1 to 5 :",
                    "Number", // Name of the window
                    QUESTION_MESSAGE // Type of program
                    ));
    }
// End of the constructor - - - - - - - - ^
    public void output_Guess() {
        // Conditional statement
        if( ans == num ) {
            txt = "You guessed it! The number is: " + num + " !";
            icon = INFORMATION_MESSAGE;
        } else {
            txt = "You didn't guess the number, the number was: " + num;
            icon = INFORMATION_MESSAGE;
        }
        showMessageDialog(null, // Parent window
                txt, // Message text
                "Result", // Name of the window
                icon // Type of Program
        );
    }
}
