package lesson10;

import java.util.List;

public class TestEmployeeList {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        eList.forEach(Employee::printSummary);
    }
}
