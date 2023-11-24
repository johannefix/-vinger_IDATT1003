// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.InputStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        //Creating a person
        System.out.println("---------- Person info ----------");

        System.out.println("Enter first name: ");
        String firstName = newScanner.nextLine();

        System.out.println("Enter last name: ");
        String surname = newScanner.nextLine();

        System.out.println("Enter birth year: ");
        int birthYear = newScanner.nextInt();
        if (Employee.currentYear < birthYear){throw new IllegalArgumentException("Birth year must be less than current year");}

        Person person = new Person(firstName, surname, birthYear);
        System.out.println("Personal information: " + person.toString());

        //creating an employee
        System.out.println("Enter employee number: ");
        int employeeNr = newScanner.nextInt();

        System.out.println("Enter employment year: ");
        int employmentYear = newScanner.nextInt();

        System.out.println("Enter month salary: ");
        int monthSalary = newScanner.nextInt();

        System.out.println("Enter tax (%): ");
        int taxPercent = newScanner.nextInt();


        Employee employee = new Employee(person, employeeNr,employmentYear,monthSalary,taxPercent);
        System.out.println("Employee information given: ");
        System.out.println(employee);
        //employee.employeeToString();

        System.out.println("-------------------- ");

        while (true) {
            System.out.println("Make changes ");
            System.out.println("For new salary [1] \nFor new tax [2] \nExit [3]");
            int choice = newScanner.nextInt();

            if(choice > 0 && choice < 4){
                switch (choice){
                    case 1:
                        System.out.println("Input new salary: ");
                        int newSalary = newScanner.nextInt();
                        employee.setMonthSalary(newSalary);
                        System.out.println(employee.employeeToString());
                        break;
                    case 2:
                        System.out.println("Input new tax: ");
                        int newTax = newScanner.nextInt();
                        employee.setTaxPercent(newTax);
                        System.out.println(employee.getTaxPercent());
                        System.out.println(employee.employeeToString());
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
                System.out.println("please print a number between 1-3");

            }
        }
    }
}