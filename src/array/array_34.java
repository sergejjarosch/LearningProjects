package array;
import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array_34 {
    public void array_34_out () {
        // Text Array
        char[] symbs = { 'J', 'a', 'v', 'a'};
        // Text vorstellung des Arrays
        String str = Arrays.toString(symbs);
        // Erstellen des Textes auf Basis des Arrays
        String txt = new String(symbs);
        // Output
        System.out.println(symbs);
        System.out.println(str);
        System.out.println(txt);
        // Erstellen des Arrays anhand des des Textes
        char[] word = "Pascal" .toCharArray();
        // Output
        System.out.println(Arrays.toString(word));
    }
}
