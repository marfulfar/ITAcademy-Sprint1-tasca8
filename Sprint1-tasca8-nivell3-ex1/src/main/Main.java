package main;

import student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ryan",17, "java",8.2f));
        students.add(new Student("Angela",16, "php",4.7f));
        students.add(new Student("Kelly",17, "java",7.6f));
        students.add(new Student("Jim",15, "php",9.1f));
        students.add(new Student("Erin",14, "spring",8.6f));
        students.add(new Student("Dwight",18, "spring",9.8f));
        students.add(new Student("Micheal",13, "nodejs",6f));
        students.add(new Student("Pam",12, "nodejs",7.8f));
        students.add(new Student("Creed",20, "java",7f));
        students.add(new Student("Oscar",15, "php",4.2f));

        System.out.println("Prints every student's name and age");
        students.stream().forEach(s-> System.out.println(("Name: "+s.getName() +" Age: "+ s.getAge())));

        System.out.println("Filter name starts with an a and print them in a list");
        students.stream()
                .filter(s->s.getName().startsWith("A"))
                .collect(Collectors.toList())
                .stream()
                .forEach(student -> System.out.println(student.getName()));

        System.out.println("Printing filtered list of mark 5 or superior");
        students.stream()
                .filter(student -> student.getMark() >=5)
                .forEach(student -> System.out.println(student.getName()));

        System.out.println("Printing filtered list of mark 5 or superior and not php students");
        students.stream()
                .filter(student -> student.getMark()>=5 && student.getCourse()!="php")
                .forEach(student -> System.out.println(student.getName()));

        System.out.println("Printing filtered list of adults students of java");
        students.stream()
                .filter(student -> student.getAge()>=18 && student.getCourse()=="java")
                .forEach(student -> System.out.println(student.getName()));





    }//closes main

}//closes class