package asahin.polynom;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionTest {
    @Test
    public void testFunction() throws Exception {
        // x^3
        Function f1 = new PowerFunction(3);
        // x
        Function f2 = new IdentityFunction();
        // x^3 + x
        Function f3 = new AddFunction(f1, f2);
        // 8
        Function f4 = new ConstantFunction(8);

        // (x^3 +x) * 8
        Function f5 = new MultiplyFunction(f3, f4);
        // (5^3 +5) * 8  =
        double result = f5.calculate(5);
        assertEquals(1040D, result,0.0001);
  }
}
