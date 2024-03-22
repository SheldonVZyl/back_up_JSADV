package lesson10;

import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        System.out.println("\nCO Bonus Details");

        eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.println("Name: " + e.getGivenName() + " " + "Surname: " + e.getSurName()))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .sorted()
                .forEach(d -> System.out.printf("Bonus paid: $%,6.2f %n", d));
    }
}
