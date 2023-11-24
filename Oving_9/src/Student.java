public class Student {
  private final String name;
  private int numberOfTasks;
  
  Student(String name, int numberOfTasks){
    this.name = name;
    this.numberOfTasks = numberOfTasks;
  }
  public String getName(){
    return name;
  }
  public int getNumberOfTasks(){return numberOfTasks;}
  public void increaseNOfTasks(int increase){
    numberOfTasks = numberOfTasks + increase;
  }
  public String toString(){return "Student name: " + getName() + "\nNumber of tasks: " + getNumberOfTasks(); }

  //Test-program
  public static void main(String[] args) {
    Student test = new Student("Kari", 4);
    Student test2 = new Student("Ola", 1);
    System.out.println(test.toString());
    System.out.println(test2.toString());
    test.increaseNOfTasks(2);
    System.out.println("\n(Student 1 info after increased number of tasks) "+ "\n" + test.toString());


  }
}



