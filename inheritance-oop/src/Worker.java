public class Worker {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "12-25-1984", "01-01-2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());


        SalariedEmployee joe = new SalariedEmployee("Joe", "12-02-1984", "01-10-2020", 50000);
        System.out.println(tim);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Joe's Pay = " + joe.collectPay());
        joe.retire();
        System.out.println("Joe's retired pay = $" + joe.collectPay() + " bi-weekly");

        HourlyEmployee mary = new HourlyEmployee("Mary" ,"05-05-1996", "05-10-2018", 15);

        System.out.println(mary);
        System.out.println("Mary's bi-weekly pay is $"+mary.collectPay());
        System.out.println("Mary's holiday pay is $"+mary.collectDoulePay());
    }

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate( String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

 class Employee extends Worker {

    private long employeeId;
    private static int empNumber = 1;
    private String hireDate;


     public Employee(String name, String birthDate, String hireDate) {
         super(name, birthDate);
         this.employeeId = Employee.empNumber++;
         this.hireDate = hireDate;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "employeeId=" + employeeId +
                 ", hireDate='" + hireDate + '\'' +
                 ", endDate='" + endDate + '\'' +
                 "} " + super.toString();
     }
 }

class SalariedEmployee extends Employee{

    private double salary;

    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double salary) {
        super(name, birthDate, hireDate);
        this.salary = salary;
    }

    @Override
    public double collectPay() {
        double payCheck = (int) salary / 26;
        double retiredPay = (isRetired) ? 0.9 * payCheck : payCheck;

        return (int) retiredPay;
    }

    public void retire() {
        terminate("12-12-2023");
        isRetired = true;
    }




}

class HourlyEmployee extends Employee {

    private double hourlyPay;
    public void getPay(double hourlyPay) {

    }

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPay) {
        super(name, birthDate,  hireDate);
        this.hourlyPay = hourlyPay;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPay;
    }

    public double collectDoulePay() {
        return 2 * collectPay();
    }
}
