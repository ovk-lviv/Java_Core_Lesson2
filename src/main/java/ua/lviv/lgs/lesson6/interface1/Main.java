package ua.lviv.lgs.lesson6.interface1;

public class Main {
    public static void main(String[] args) {
        EmployeePerMonth epm = new EmployeePerMonth(6,3);
        epm.calculateSalary();

        EmployeePerHour eph = new EmployeePerHour(2,2.7);
        eph.calculateSalary();

    }

}
