package task2;

public class Employee extends Person implements Comparable<Employee> {

    public Employee(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    /*//sorting according to salary.
    @Override
    public int compareTo(Employee o) {
        if (getSalary() == o.getSalary()) {
            return 0;
        } else if (getSalary() > o.getSalary()) {
            return -1;
        } else return 1;
    }*/

    //sorting according surname and name
    @Override
    public int compareTo(Employee o) {
        int surnameComp = this.getSurname().compareTo(o.getSurname());

        if (surnameComp == 0) {
            return getName().compareTo(o.getName());
        }
        return surnameComp;
    }
}