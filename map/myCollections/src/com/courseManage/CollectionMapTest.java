package com.courseManage;

import java.util.*;

public class CollectionMapTest {

    //设计集合结构将以上信息存储到集合中，并打印集合元素信息。
    //
    //​    打印要求：将同一个学生的学科和成绩汇总打印(冒号分隔，含多个学科和分数逗号分割)
    //
    //​         20190001  孙悟空  数据结构:80,高数:85,java:100
    //
    //​    20190002  猪八戒   高数:60
    //
    //统计该班每个学科的平均分。
    //HashMap<String,HashMap<String,>>

    public static void main(String[] args) {

        LinkedHashSet<Student> studentSet = new LinkedHashSet<>();//存储学生信息
        //重写equals方法使得 学号唯一

        System.out.println("-----------学生信息录入程序---------");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("---请选择操作   1.录入信息----2.查看信息----3自动录入一组信息----4.退出菜单---");
            int chose = s.nextInt();
            switch (chose) {
                case 1:

                    addStudent(studentSet);


                    break;
                case 2:
                    shouInfo(studentSet);

                    break;
                case 3:


                    HashMap<String, String> se = new HashMap<>();
                    se.put("数据结构", "80");
                    Student s1 = new Student("20190001", "孙悟空", se);
                    addAuto(studentSet, s1);

                    HashMap<String, String> se1 = new HashMap<>();
                    se1.put("高数", "60");
                    Student s2 = new Student("20190002", "猪八戒", se1);
                    addAuto(studentSet, s2);

                    HashMap<String, String> se2 = new HashMap<>();
                    se2.put("高数", "90");
                    Student s3 = new Student("20190003", "唐僧", se2);
                    addAuto(studentSet, s3);

                    HashMap<String, String> se3 = new HashMap<>();
                    se3.put("java", "70");
                    Student s4 = new Student("20190004", "沙和尚", se3);
                    addAuto(studentSet, s4);

                    HashMap<String, String> se4 = new HashMap<>();
                    se4.put("高数", "85");
                    Student s5 = new Student("20190001", "孙悟空", se4);
                    addAuto(studentSet, s5);

                    HashMap<String, String> se5 = new HashMap<>();
                    se5.put("数据结构", "98");
                    Student s6 = new Student("20190003", "唐僧", se5);
                    addAuto(studentSet, s6);

                    HashMap<String, String> se6 = new HashMap<>();
                    se6.put("高数", "78");
                    Student s7 = new Student("20190004", "沙和尚", se6);
                    addAuto(studentSet, s7);

                    HashMap<String, String> se7 = new HashMap<>();
                    se7.put("java", "94");
                    Student s8 = new Student("20190003", "唐僧", se7);
                    addAuto(studentSet, s8);

                    HashMap<String, String> se8 = new HashMap<>();
                    se8.put("java", "100");
                    Student s9 = new Student("20190001", "孙悟空", se8);
                    addAuto(studentSet, s9);


                    System.out.println("-------录入的信息为----------");

                    for (Student student : studentSet) {

                        System.out.print(student.getSid() + "  " + student.getName() + "  ");
                        Set<String> key = student.getCourseAndGrade().keySet();
                        for (String str : key) {
                            System.out.print(str + "  :" + student.getCourseAndGrade().get(str));

                        }
                        System.out.println();

                    }


                    break;
                case 4:
                    System.out.println("退出系统成功");
                    return;
                default:
                    System.out.println("选择操作不合法，请重新输入");
                    break;

            }


        }

    }


    public static void shouInfo(LinkedHashSet<Student> lset) {
        // Scanner s=new Scanner(System.in);
        float avDaGrade = 0;
        int daNum = 0, maNum = 0, jaNum = 0;
        float avMaGrade = 0;
        float avJaGrade = 0;

        for (Student student : lset) {

            System.out.print(student.getSid() + "  " + student.getName() + "  ");
            Set<Map.Entry<String, String>> se = student.getCourseAndGrade().entrySet();
            String cs;
            String grade;
            int count = 1;

            for (Map.Entry<String, String> str : se) {
                cs = str.getKey();//课程
                grade = str.getValue();
                System.out.print(cs + ":" + grade);
                if (count < se.size()) {
                    System.out.print(",");
                    count++;
                } else
                    System.out.print("");
                if (cs.equals("数据结构")) {
                    avDaGrade += Float.parseFloat(grade);
                    daNum++;
                }
                if (cs.equals("高数")) {
                    avMaGrade += Float.parseFloat(grade);
                    maNum++;
                }
                if (cs.equals("java")) {
                    avJaGrade += Float.parseFloat(grade);
                    jaNum++;
                }
            }

            System.out.println();

        }

        System.out.println("数据结构:" + (avDaGrade / daNum) + " 高数：" + (avMaGrade) / maNum + " java:" + (avJaGrade / jaNum));


    }

    public static void addAuto(LinkedHashSet<Student> lset, Student student) {

        String sid = student.getSid();
        String name = student.getName();

        Map<String, String> csg = student.getCourseAndGrade();//新的
        System.out.println("新的：" + csg);
        // System.out.println(student);
        Iterator<Student> it = lset.iterator();

        while (it.hasNext()) {
            Student stu = it.next();
            if (stu.getSid().equals(sid)) {
                Map<String, String> oldmap = stu.getCourseAndGrade();//原来的
                for (String s : oldmap.keySet()) {

                    System.out.println(s + "oldmap前" + oldmap.get(s));

                }
                for (String s1 : csg.keySet()) {

                    oldmap.put(s1, csg.get(s1));//重新赋值到 csg
                    //System.out.println(s1+"  "+csg.get(s1));
                }

                Student stu1 = new Student(sid, name, csg);
                lset.remove(stu1);
                stu1.setCourseAndGrade(oldmap);

                lset.add(stu1);

                return;
            }

        }

        Student stu = new Student(sid, name, csg);
        lset.add(stu);

    }


    public static void addStudent(LinkedHashSet<Student> lset) {

        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生学号");
        String sid = s.nextLine();
        System.out.println("请输入学生姓名");
        String name = s.nextLine();
        //输入课程和成绩 到map

/*        while (true){

        }*/
        System.out.println("请输入课程名");
        String cs = s.nextLine();
        System.out.println("请输入成绩");
        String grade = s.next();


        Map<String, String> csg = new HashMap<String, String>();
        csg.put(cs, grade);

        Iterator<Student> it = lset.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            if (stu.getSid().equals(sid)) {
                Map<String, String> oldmap = stu.getCourseAndGrade();
                for (String s1 : csg.keySet()) {

                    oldmap.put(s1, csg.get(s1));//重新赋值到 csg
                }

                Student stu1 = new Student(sid, name, csg);
                lset.remove(stu1);
                stu1.setCourseAndGrade(oldmap);
                lset.add(stu1);
                return;

            }

        }

        Student stu = new Student(sid, name, csg);
        lset.add(stu);


    }


}
