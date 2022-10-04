package ua.lviv.lgs.lesson6.interface1;

public class EmployeePerHour implements Payable {
    private int hour;
    private double hourlyRate;
    EmployeePerHour (int hour, double hourlyRate) {
        this.hour = hour;
        this.hourlyRate = hourlyRate;
    }

    public void calculateSalary() {
        System.out.println(hour*hourlyRate);

    }
}
