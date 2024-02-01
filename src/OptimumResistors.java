public class OptimumResistors {
    // Resistance of the resistors in ohms
    double R1 = 3, R2 = 5, R3 = 2, R = 1;

    // Calculation values for chain resistance
    double r1, r2, r3;
    // Logical values for determination
    boolean A, B;
    OptimumResistors() { // Konstruktor
    // Calculation of the resistance of the chain area for different values
        r1 = R2 * R3 / ( R2 + R3) + R1 * R / ( R1 + R);
        r2 = R1 * R3 / ( R1 + R3 ) + R2 * R / ( R2 + R);
        r3 = R2 * R1 / ( R2 + R1 ) + R3 * R / ( R3 + R);
    // Determining the criteria for switching
        A = ( r1 <= r2 ) && ( r1 <= r3 );
        B = ( r2 <= r1 ) && ( r2 <= r3 );
    }
    // Methode
    public void outputTransistor() {
    // Output of the initial values
        System.out.println("Resistor resistance values: ");
        System.out.println("# 1. Resistor: R1=" + R1 + " Oh");
        System.out.println("# 2. Resistor: R2=" + R2 + " Oh");
        System.out.println("# 3. Resistor: R3=" + R3 + " Oh");
        System.out.println("Main Resistor R= " + R3 + "Oh");
    // Calculation and value output
        System.out.println("The second block is connected ");
        System.out.println(A? "# 1. " + " resistor" : B? "# 2. " + " resistor" : "# 3. " + " resistor");
    }
}
