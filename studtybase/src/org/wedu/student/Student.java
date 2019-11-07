package org.wedu.student;

public class Student {

    private String sid ;// 学生id
    private String name ;// 学生姓名
    private String age ;// 学生年龄
    private String address ;// 学生所在地


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学生id='" + sid + '\'' +
                ", 学生姓名='" + name + '\'' +
                ", 学生年龄='" + age + '\'' +
                ", 学生所在地='" + address + '\'' +
                '}';
    }

    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }
}
