package problem_4;

class Test {
    public static void main(String[] args) {
        Circuit r1 = new Resistor(100);
        Circuit r2 = new Resistor(200);
        Circuit r3 = new Resistor(300);

        Circuit series = new Series(r1, r2);
        Circuit circuit = new Parallel(series, r3);

        circuit.applyPotentialDiff(12); 

        System.out.println("Total Resistance: " + circuit.getResistance());
        System.out.println("Current: " + circuit.getCurrent());
        System.out.println("Power: " + circuit.getPower());
    }
}