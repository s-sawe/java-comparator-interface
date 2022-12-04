package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort1 {
    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101,"Sharon",22));
        al.add(new Student(106,"Zuri",78));
        al.add(new Student(107,"Chai",90));

        Comparator<Student> cm1 = Comparator.comparing(Student::getName);
        Collections.sort(al,cm1);
        System.out.println("Sort By Name");
        for (Student st : al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }

        Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
        Collections.sort(al,cm2);
        System.out.println("Sorting By Age");
        for (Student st : al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }
}