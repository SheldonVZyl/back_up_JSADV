package lesson10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestTerminalOps {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        System.out.println("\nExecutive Count");
        long execCount =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .count();

        System.out.println("Exec count: " + execCount);

        System.out.println("\nHighest Paid Exec");
        Optional highestExec =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .max(Employee::sortBySalary);

        if (highestExec.isPresent()) {
            Employee temp = (Employee) highestExec.get();
            System.out.printf(
                    "\nName: " + temp.getGivenName() + "\nSurname: "
                            + temp.getSurName() + "   \nSalary: $%,6.2f %n ",
                    temp.getSalary());

            System.out.println("\nLowest Paid Staff");
            Optional lowestStaff =
                    eList.stream()
                            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                            .min(Comparator.comparingDouble(e -> e.getSalary()));

            if (lowestStaff.isPresent()) {
                Employee temp2 = (Employee) lowestStaff.get();
                System.out.printf("\nName: " + temp2.getGivenName()
                        + "\nSurname: " + temp2.getSurName() +
                        "   \nSalary: $%,6.2f %n ", temp2.getSalary());
            }
        }
    }
}
