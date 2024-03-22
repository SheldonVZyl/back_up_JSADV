package lesson4;

public class TestOverriding {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Jim Smith",
                "011-12-2345", 100_000.00);
        Manager m = new Manager(102,"Joan Kern",
                "012-23-4567", 100_450.54, "Marketing");
        System.out.println(e.getDetails());
        System.out.println(m.getDetails());
    }
}
