package asahin.polynom;

public class ConstantFunction implements Function {
    private final double constValue;

    public ConstantFunction(double  constValue) {
        this.constValue=constValue;
    }

    @Override
    public double calculate(double x) {
        return this.constValue;
    }
}
