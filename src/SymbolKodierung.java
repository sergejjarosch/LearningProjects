import java.lang.foreign.*;

public class SymbolKodierung {
    // Code Number
    int num;
    // Output letters for the code
    char A = 'a',B = 'b';
    // Letters after decoding
    char X, Y;

    public SymbolKodierung() {
        // First letters
        num = ((int) B<<16) + ((int) A);
    }
    public void OutputSymKord () {
        // Output
        System.out.println("First letters: \'" + A + "\' and \'" + B + "\'." );
        System.out.println("Code Number: " +num);
        // decoding
        Y = (char) (num >>> 16);
        X = (char) (num^((int) Y << 16));
        //output decoding result
        System.out.println("Reverse conversion: ");
        System.out.println("Letters \'" + X + "\' and \'" + Y + "\' .");
    }
}
