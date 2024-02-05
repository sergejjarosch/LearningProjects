package array;
import static javax.swing.JOptionPane.*;
import javax.swing.ImageIcon;
public class array_35 {
    public void array_35_out () {
        //Pfad zu den Bildern
     String path = "src/img/";
     // Text Array mit den Tier Namen:
        String[] names = {"Löwe", "Tiger", "Bär"};
        // Text Array mit den Dateinnamen
        String[] files = {"lion.jpg", "tiger.jpg", "bear.jpg"};
        // Fenster mit der liste
        String animals = (String)showInputDialog(
                null, // link an das Elternfenster
                "Welches Raubtier soll gezeigt werden? ", // Text über die Liste
                "Raubtiere", // Überschrift des Fensters
                QUESTION_MESSAGE, // Piktogramm
                null, // Anzeige für das Piktogramm
                names, // Array bestimmt die anzeige der Liste
                names[0] // Ausgewähltes Objekt der Liste
        );
        // Index des ausgewählten Objekts
        int index = 0;
        // Index Ermittlung
        for (int k = 1; k < names.length; k++) {
            if (animals.equals(names[k])) {
                index = k;
                break;
            }
        }
        // Objekt erstellen Bild
        ImageIcon img = new ImageIcon(path + files[index]);
        // Image Fenster
        showMessageDialog(null, img, animals, PLAIN_MESSAGE);
    }
}
