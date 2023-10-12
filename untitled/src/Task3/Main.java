package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Peter");
        Student student3 = new Student("Tobias");

        student1.addHasPassed("Java 1.0");
        student3.addHasPassed("Math");

        Teacher teacher1 = new Teacher("Bo");
        Teacher teacher2 = new Teacher("Jimmy");
        teacher1.addCanTeach("Java 1.0");
        teacher2.addCanTeach("Matematik");


        ArrayList<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(student1);
        listOfPerson.add(student3);
        listOfPerson.add(teacher1);
        listOfPerson.add(teacher2);

        for(int i = 0; i < listOfPerson.size(); i++) {
           listOfPerson.get(i).addCourse("Java 1.0");

        }


    }
}
