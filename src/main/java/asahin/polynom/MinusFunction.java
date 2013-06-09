package asahin.polynom;

public class MinusFunction implements Function {
    private final Function[] arguments;

    public MinusFunction(Function... arguments) {
        this.arguments = arguments;
    }

    @Override
    public double calculate(double x) {
        double result = 0;
        for (Function f : arguments) {
            result -= f.calculate(x);
        }
        return result;
    }
}
