package Task3;

import java.util.ArrayList;

public class Student extends Person {
    String name;

    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    Student(String name){
        super(name);
        this.passedCourses = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }


    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course)){
            System.out.println("Student: " + getName() + " can't add that as " + getName() +" already has passed " + course);
            return false;
        }
        else {
            currentCourses.add(course);
            System.out.println(getName() + " has added the " + course);
            return true;
        }
    }

    public  boolean addHasPassed(String course) {
        if(passedCourses.contains(course)) {
            return false;
        }
        else {
            passedCourses.add(course);
            return true;
        }
    }


}
