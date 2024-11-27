package OOP.oop_lab_2.problem4;

public class Parallel extends Circuit {
    private Circuit c1, c2;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        double R1 = c1.getResistance();
        double R2 = c2.getResistance();
        return 1 / (1 / R1 + 1 / R2);
    }

    @Override
    public double getPotentialDiff() {
        return c1.getPotentialDiff();  // разность потенциалов будет одинаковая
    }

    @Override
    public void applyPotentialDiff(double V) {
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}
