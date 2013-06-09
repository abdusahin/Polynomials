package asahin.polynom;

public class DivFunction implements Function {
    private final Function[] arguments;

    public DivFunction(Function... arguments) {
        this.arguments = arguments;
    }

    @Override
    public double calculate(double x) {
        double sum = 1;
        for (Function f : arguments) {
            sum *= f.calculate(x);
        }
        return sum;

    }
}
