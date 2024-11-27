package OOP.oop_lab_2.problem4;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    // p = v^2 / r
    public double getPower() {
        double V = getPotentialDiff();
        double R = getResistance();
        return V * V / R;
    }

    // i = v / r
    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }
}
