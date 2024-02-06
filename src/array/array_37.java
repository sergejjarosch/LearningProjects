package array;
import java.util.*;
public class array_37 {
    public void arra_37_out () {
        // Ausgangs Array
        int[] nums = {10, 20, 30, 40, 50,};
        System.out.println("Ausgangs Array: ");
        //Der Array Inhalt wird angezeigt:
        System.out.println(Arrays.toString(nums));
        Scanner input = new Scanner(System.in);
        System.out.println("Array INDEX zum LÖSCHEN");
        // Auslesen der Elemente zum Löschen
        int index = input.nextInt();
        //Wenn Index im gültigen Bereich:
        if ((index >= 0 ) && ( index < nums.length)) {
            //Neues Array erstellen
            int [] m = new int [nums.length - 1];
            // erstelltes Array befüllen
            for ( int k = 0; k < index ; k++ ){
                m [k] = nums [k];
            }
            for (int k = index + 1; k < nums.length; k++) {
                m[k-1] = nums[k];
            }
            // Variable nums wird ein neuer Wert zugewiesen
            nums = m;
        }
        System.out.println("Nach dem Objekt gelöscht wird: ");
        // wird Array Inhalt angezeigt:
        System.out.println(Arrays.toString(nums));
    }
}
