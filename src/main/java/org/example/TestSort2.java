package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort2 {

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(109,"Mimi",89));
        arrayList.add(new Student(110,"Shosh", 30));
        arrayList.add(new Student(108,null,80));

        Comparator<Student> cm1 = Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
        Collections.sort(arrayList, cm1);
        System.out.println("Considers Nulls < Non-nulls");
        for (Student st : arrayList){
            System.out.println(st.rollNo+" "+st.name+" "+ st.age);
        }

        Comparator<Student> cm2 = Comparator.comparing(Student::getName, Comparator.nullsLast(String::compareTo));
        Collections.sort(arrayList, cm2);
        System.out.println("Considers Nulls to be > Non-nulls");
        for (Student st : arrayList){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }

    }
}
