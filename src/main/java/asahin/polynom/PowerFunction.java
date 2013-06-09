package asahin.polynom;

public class PowerFunction implements Function {
    private final double power;

    public PowerFunction(double power) {
        this.power=power;
    }

    @Override
    public double calculate(double x) {
        return Math.pow(x, power);
    }
}
