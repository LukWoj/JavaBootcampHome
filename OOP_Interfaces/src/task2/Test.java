package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Employee designerManager1 = new Employee("Robert", "Harisson", 10000);
        Employee designer1 = new Employee("Mary", "Kowalski", 4500);
        Employee designer2 = new Employee("Harry", "Kowalski", 6000);
        Employee designer3 = new Employee("Tom", "Clancy", 5000);
        Employee designer4 = new Employee("Tom", "Ford", 5000);

        List<Employee> employeeList = new ArrayList<>(20);
        employeeList.add(designerManager1);
        employeeList.add(designer1);
        employeeList.add(designer2);
        employeeList.add(designer3);
        employeeList.add(designer4);

        Collections.sort(employeeList);

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
