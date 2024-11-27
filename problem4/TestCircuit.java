package OOP.oop_lab_2.problem4;

public class TestCircuit {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);

        Circuit g = new Parallel(c, d);

        Circuit h = new Series(g, e);

        Circuit circuit = new Parallel(h, f);

        System.out.printf("Equivalent Resistance: %.2f\n", circuit.getResistance());

        circuit.applyPotentialDiff(12);

        System.out.printf("Total Power: %.2f\n", circuit.getPower());
        System.out.printf("Total Current: %.2f\n", circuit.getCurrent());
    }
}
