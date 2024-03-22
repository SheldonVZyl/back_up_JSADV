package lesson4;

import static java.lang.Math .*;

public class TestStaticImport {
    public static void main(String[] args) {
        System.out.println("Random: " + random() * 10);
        System.out.println("Square root: " + sqrt(9.0));
        System.out.println("Rounded random: " + round(Math.random() * 100));
        System.out.println("Abs: " + abs(-9));
    }
}
