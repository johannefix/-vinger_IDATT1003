import java.util.Calendar;
import java.util.GregorianCalendar;
public class Employee {

    final private Person personalia;
    final private int employeeNr;
    final private int employmentYear;
    private int monthSalary;
    private double taxPercent;
    public static GregorianCalendar calendar = new GregorianCalendar();
    public static int currentYear = calendar.get(Calendar.YEAR);

    public Employee(Person personalia, int employeeNr, int employmentYear, int monthSalary, double taxProsent) {
        this.personalia = personalia;
        this.employeeNr = employeeNr;
        this.employmentYear = employmentYear;
        this.monthSalary = monthSalary;
        this.taxPercent = taxProsent;
    }

    //get-methods
    public Person getPersonalia() {
        return personalia;
    }

    public int getEmployeeNr() {
        return employeeNr;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    //set-methods. Salary and Tax can change for an employee
    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public void setTaxPercent(int taxPercent) {
        this.taxPercent = taxPercent;
    }

    public double taxEachMonth() {
        return (double) getMonthSalary() * (getTaxPercent()/100);
    } //tax drawn each month

    public int grossSalary() {
        return getMonthSalary() * 12;
    }

    public double taxDeduction() {
        // doesn't pay tax in june and only half in december
        return taxEachMonth() * 10.5;
    }

    public String fullName() {
        return getPersonalia().getSurname() + ", " + getPersonalia().getFirstName();
    }

    public int age() {
        return currentYear - getPersonalia().getBirthYear();
    }

    public int yearsInCompany() {
        return currentYear - getEmploymentYear();
    }

    public boolean employedMoreThan(int yearCheck) {
        return yearCheck <= yearsInCompany();
    }

    String employeeToString() {
        System.out.println("----- Employee information ----");
        System.out.println("employee: " + fullName());
        System.out.println("age: " + age());
        System.out.println("years in company: " + yearsInCompany());
        System.out.println("month salary: " + monthSalary);
        System.out.println("tax each month: " + taxEachMonth() + " kr");
        System.out.println("gross salary: " + grossSalary() + " kr");
        System.out.println("employed more than " + "10 years: " + employedMoreThan(10));
        return "";
    }

    @Override
    public String toString() {
        return "INFO";
    }
}