public class clientProgram {
    public static void main(String[] args) {
        Person oda = new Person("Oda","Meier",2001);
        Employee odaMeier = new Employee(oda, 7832, 2022, 2000, 4);

        System.out.println(oda.toString());
        System.out.println(odaMeier.employeeToString());

    }

}
