package algorithmen;
import static java.lang.Math.random;
public class BubbleSort {
    public void BubbleSort_output() {
        // Array Größe und Variable:
        int n = 15, s;
        //Array erstellen:
        int[] nums = new int[n];
        System.out.println("Ausgangs Array");
        //Array befüllen und anzeigen der Werte
        for ( int k =0; k < nums.length; k++ ) {
            //Werte der Elementen - zufällige Zahlen:
            nums[k] = (int)(5*n*random());
            System.out.print(nums[k] + " ");
        }
        // Array sortieren:
        for (int m = 1; m < nums.length; m++){
            for (int k = 0; k < nums.length -m; k++ ){
                if(nums[k] > nums [k + 1]) {
                    // Tausch der Werte
                    s = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k+1] = s;
                }
            }
        }
        // Ergebniss Ausgabe:
        System.out.println("\nArray nach dem Sortieren:");
        for (int k=0;k<nums.length; k++){
            System.out.print(nums[k] + " ");
        }
        // Sprung in neue Zeile
        System.out.println();
    }
}
