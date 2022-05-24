public class IntsCalculator implements Ints{
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        int a = (int) target
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return a;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int a = (int) target
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return a;
    }

    @Override
    public int pow(int a, int b) {
        int x = (int) target
                .newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return x;
    }

}
