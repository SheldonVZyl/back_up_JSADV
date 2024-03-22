package lesson9;

import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;

public class TestToDoubleFunction {
    public static void main(String[] args) {
        DoubleFunction<String> calc = t-> String.valueOf(t*3);
        String result = calc.apply(20);
        System.out.println("New value is: " + result);
    }
}
