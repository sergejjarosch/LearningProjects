import static javax.swing.JOptionPane.*;
import javax.swing.ImageIcon;
public class ConfirmationWindow {
    int res;

    public ConfirmationWindow() {
        // Warning window
        res = showConfirmDialog(null, // Parent window
                "Do you want to see a red panda?", // Message
                "Question", // Window designation
                 YES_NO_OPTION // <- Buttons
        );
    }
    public void otput_ConWin(){
        //Simplified form of conditional branching
        if( res == YES_OPTION){
            //Complete path to the image
            String file = "src/img/red_pand.png";
            // Create object for the image
            ImageIcon img = new ImageIcon(file);
            // Show window with the image
            showMessageDialog(null, // Parent window
                    img , // Image
                    "Red Panda", // Window designation
                    PLAIN_MESSAGE // Pictogram not available
                    );
        }
    }
}
