package problem_4;

class Parallel extends Circuit {
    private Circuit c1, c2;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        double r1 = c1.getResistance();
        double r2 = c2.getResistance();
        return 1.0 / (1.0 / r1 + 1.0 / r2);
    }

    @Override
    public double getPotentialDiff() {
        // Same across both branches
        return c1.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}