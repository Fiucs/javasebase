package org.wedu.demo1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=18;
        s1.name="peppa";
        s1.study();
        s1.doHomeWork();
        System.out.println(Student.place);
    }
}
