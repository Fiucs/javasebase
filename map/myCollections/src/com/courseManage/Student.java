package com.courseManage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String sid;
    private String name;
    private Map<String,String> courseAndGrade;//课程 -分数

    public Student(String sid, String name, Map<String, String> courseAndGrade) {
        this.sid = sid;
        this.name = name;
        this.courseAndGrade = courseAndGrade;
    }

    public Student() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", courseAndGrade=" + courseAndGrade +
                '}';
    }

    public Map<String, String> getCourseAndGrade() {
        return courseAndGrade;
    }

    public void setCourseAndGrade(Map<String, String> courseAndGrade) {
   /*     Set<String> set = courseAndGrade.keySet();
        for (String s : set) {

            this.courseAndGrade.put(s,courseAndGrade.get(s));//设置 添加 课程分数 不用重写

        }*/
   this.courseAndGrade=courseAndGrade;



    }
}
