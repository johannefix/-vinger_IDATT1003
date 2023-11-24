public class Person {
    private final String firstName;
    private final String surname;
    private final int birthYear;


    public Person(String firstName, String surname, int birthYear){

        this.firstName = firstName;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSurname() {
        return surname;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public String toString(){
        return getFirstName() + " " + getSurname() + " " + getBirthYear();
    }
}
