package array;

public class array_32 {
    public void array_32_out() {

        int i, j, n = 3, val = 1;

        // Erstellen des Zweidimensinelen Array
        int[][] nums = new int[n - 1][n];
        // einfügen des Schleifenoperators
        for (i = 0; i < n - 1; i++){
            for ( j = 0; j < n; j++) {
                nums [i][j] = val++;
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}





