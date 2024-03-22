package lesson5;

import lesson5.Employee;

public class TestFinalObjectsReference {
    public static void main(String[] args) {
        final Employee emp1 = new Employee(1, "Sue", "02-002-1245", 10000.00);
        Employee emp2 = new Employee(1, "Sue", "02-002-1234", 10000.00);
        emp1.setEmpId(100); // can Change values but
        // emp1 = emp2; cannot change reference to a different object because emp1 is final
    }
}
