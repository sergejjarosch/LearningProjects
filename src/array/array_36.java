package array;
import static javax.swing.JOptionPane.*;
import javax.swing.ImageIcon;
public class array_36 {

    public void array_36_output () {
        //Pfad zu derm Ordner mit den Dateien
        String path = "src/img/";
        // Text Array mit den Raubtier Namen
        String[] names = {"Löwe", "Tiger", "Bär"};
        // Text Array mit den Dateinamen: JPG
        String [] files = {"lion.jpg", "tiger.jpg", "bear.jpg"};
        // Anzeige mit der Auswahl der Knöpfe:
        int index = showOptionDialog(null, // Parent Window
                "Wählen Sie einen Raubtier",
                "Raubtiere",
                DEFAULT_OPTION, //Art des Fenster - Standart
                WARNING_MESSAGE, // Art des Piktogramms
                null, // Anzeige für das Piktogramm
                names, // Array für die Knöpfe
                names[0] // Aktive auswahl - standartmässig
        );
        // Objekt erzeugen für das Bild
        ImageIcon img = new ImageIcon(path + files[index]);
        // Fenster mit dem Bild
        showMessageDialog(
                null, img, names[ index ], PLAIN_MESSAGE
        );
    }

}
