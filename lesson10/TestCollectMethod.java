package lesson10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollectMethod {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        List<Employee> nList = new ArrayList<>();

        nList = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .sorted(Comparator.comparing(Employee::getSurName))
                .collect(Collectors.toList());

        System.out.println("\nSorted CO Executive on surname");

        nList.stream()
                .forEach(Employee::printSummary);
    }
}
