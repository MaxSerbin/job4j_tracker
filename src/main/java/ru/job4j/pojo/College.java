package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setGroup("engineer");
        student.setDate("01.09.1998");

        System.out.println(student.getName() + " is a student, he is an " + student.getGroup() + " from " + student.getDate());
    }
}
