package lesson10;

import java.util.List;
import java.util.OptionalDouble;

public class TestAvg {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        System.out.println("\nAverage CO Bonus");

        OptionalDouble result;

        result = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .average();

        if (result.isPresent()) {
            System.out.printf("Average Bonuses paid: $%,6.2f %n",
                    result.getAsDouble());
        }
    }
}
