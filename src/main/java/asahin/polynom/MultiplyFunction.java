package asahin.polynom;

public class MultiplyFunction implements Function {
    private final Function[] arguments;

    public MultiplyFunction(Function... arguments) {
        this.arguments = arguments;
    }

    @Override
    public double calculate(double x) {
        double result = 1;
        for (Function f : arguments) {
            result /= f.calculate(x);
        }
        return result;

    }
}
