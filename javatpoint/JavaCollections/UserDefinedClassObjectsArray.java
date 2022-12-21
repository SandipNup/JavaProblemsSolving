package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

public class UserDefinedClassObjectsArray {
    public static void main(String[] args) {
        Student s1 = new Student(8, "Sandip Neupane", 26);
        Student s2 = new Student(9, "Roshan Adhikari", 25);
        Student s3 = new Student(10, "Ishowr Uperiti", 25);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Iterator<Student> itr = students.iterator();

        while(itr.hasNext()){
            Student nextVal = itr.next();
            System.out.println(nextVal.name + " " + nextVal.age + nextVal.rollNo);
        }
    }
}
