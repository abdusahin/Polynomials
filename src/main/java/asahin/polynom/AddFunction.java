package asahin.polynom;

public class AddFunction implements Function {
    private final Function[] arguments;

    public AddFunction(Function... arguments) {
        this.arguments = arguments;
    }

    @Override
    public double calculate(double x) {
        double sum = 0;
        for (Function f : arguments) {
            sum += f.calculate(x);
        }
        return sum;
    }
}
