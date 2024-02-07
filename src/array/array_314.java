package array;
import static java.lang.Math.random;
public class array_314 {
    public void array_314_out(){
        // Größe der Matrix
        int n = 4;
        // Zweideminsionaler Array:
        int[][] A = new int[n][n];
        // Variblen
        int i, j, tmp;
        System.out.println("Matrix Transponieren:");
        // Befüllen der Matrix mit zufälligen Zahlen:
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                A[i][j] = (int)(10*random());
                System.out.print(A[i][j] + " ");
            }
            //Sprung in neue Zeile
            System.out.println();
        }
        // Transponieren der Matrix
        for (i=0; i<n; i++){
            for (j=i+1; j<n; j++){
                tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }
        // Ergebniss anzeigen:
        System.out.println("Matrix nach Transponieren: ");
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                System.out.print(A[i][j]+ " ");
            }
            // Sprung zur neuer Zeile:
            System.out.println();
        }
    }
}
