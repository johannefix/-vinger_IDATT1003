// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    TaskOverview overview = new TaskOverview();
    Student stud1 = new Student("Britt", 17);
    Student stud2 = new Student("Arnt",2);
    Student stud3 = new Student("Torvald",10);

//legger til studentene i ArrayListen til oppgave-oversikt
    overview.registerNewStudent(stud1);
    overview.registerNewStudent(stud2);
    overview.registerNewStudent(stud3);

    System.out.println("Number of registered students: " + overview.registeredStudents());
    System.out.println("Number of tasks " + stud1.getName() + " has done: " + stud1.getNumberOfTasks());

    overview.increaseNumberOfTasks(stud1,2);
    System.out.println(stud1.getName() + " has increases tasks to: " + stud1.getNumberOfTasks());

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