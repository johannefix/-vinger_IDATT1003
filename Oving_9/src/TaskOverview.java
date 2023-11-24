import java.util.ArrayList;

public class TaskOverview {
  private ArrayList<Student> students; //Bruker ArrayList for å lagre student-objektene, dermed ikke definert max lengde
  private int numberOfStudents;


  public TaskOverview(){
    students = new ArrayList<>();
    numberOfStudents = 0;
  }


  public int registeredStudents(){ return numberOfStudents;
  }
  public int TasksSolved(Student student){
    return student.getNumberOfTasks();
  }
  public void registerNewStudent(Student newStudent) {
    students.add(newStudent);
    numberOfStudents = students.size();
  }
  public void increaseNumberOfTasks(Student student,int increase){
  student.increaseNOfTasks(increase);
}
  @Override
  public String toString() {
    return "Number of students: " + numberOfStudents;
  }
}
