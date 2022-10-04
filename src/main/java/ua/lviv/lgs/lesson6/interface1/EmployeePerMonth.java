package ua.lviv.lgs.lesson6.interface1;

public class EmployeePerMonth implements Payable {
    private int month;
    private double monthlyRate;

    EmployeePerMonth (int month, double monthlyRate) {
        this.monthlyRate=monthlyRate;
        this.month = month;
    }

    public void calculateSalary() {
        System.out.println(month*monthlyRate);
    }
}
