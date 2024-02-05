package array;

public class array_33 {
    public void array_33_out () {
        int i, j, val= 1;
        //Erstellen des Arrays, die Länge des zweiten ist nicht definiert
        int [][] nums = new int [4][];

        for ( i = 0; i < nums.length; i++) {
            nums[i] = new int [ i + 1];
        }
        //Erray ausfüllen
        for ( i = 0; i < nums [i].length; i++) {
            for ( j = 0; j < nums[i].length; j++) {
                nums [i][j] = val++;
                System.out.print(nums[i][j] + " ");
            }
            // sprung zur neuer Zeile:
            System.out.println();
        }
    }
}
