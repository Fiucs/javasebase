package org.wedu.demo1;

import org.wedu.student.Student;

import java.util.ArrayList;
import java.util.Scanner;

//1.添加 sid   name  age   birthPlace
//2.
public class StudentManageSystem {
    public static void main(String[] args) {
        boolean flag=true;
        ArrayList stuLIst=new ArrayList();//保存 学生信息 的对象
        Scanner s = new Scanner(System.in);
        System.out.println("欢迎使用会尽快送达学生管理系统");
        while (flag) {
            System.out.println("1.添加学生  2.查看学生   3.修改学生  4.删除学生  5.退出系统");
            System.out.println("请输入 1~5的整数");
            int input = s.nextInt();
            switch (input) {
                case 1:

                    addStudent(stuLIst);//添加学生
                    break;
                case 2:

                    //查看学生
                    showStudent(stuLIst);
                    break;
                case 3:
                    
                    System.out.println("请输入学生id");
                    String id =s.next();
                    changeStudent(id,stuLIst);
                    //修改学生
                    break;
                case 4:
                    //删除
                    System.out.println("请输入学生id");
                    String did =s.next();
                    delectStudent(did,stuLIst);

                    break;
                case 5:
                    System.out.println("欢迎下次再来");
                    flag=false;
                    break;
                default:
                    System.out.println("选项 输入错误*********请重新输入");


            }


        }

    }



    public static boolean checkSid(String sid, ArrayList list){
        boolean flag=false;
        Student s1 = null;//保存查找到的学生 对象
        for (int i = 0; i <list.size() ; i++) {

            s1= (Student) list.get(i);//Object 转Student
            if(sid.equals(s1.getSid())) {
                System.out.println("学生学号重复了 ，请重写输入");

                return true;
            }

        }
        return false;

    }
    public static void addStudent(ArrayList list){
        Scanner s=new Scanner(System.in);
        String sid,name,age,address;
        System.out.println("请输入学生id");
            sid=s.next();
        boolean flag=checkSid(sid,list);
        if(flag) {
            addStudent(list);
            return;
        }
        else {
            System.out.println("请输入学生name");
            name = s.next();
            System.out.println("请输入学生age");
            age = s.next();
            System.out.println("请输入学生address");
            address = s.next();
            list.add(new Student(sid, name, age, address));
        }

    }
    public static void showStudent(ArrayList list){

            printStudent(list);


    }

    public static void printSpace(int len,int flag){

        if(flag==1) {
            for (int i = 0; i < (20 - len); i++) {
                System.out.print(" ");

            }
        }
        else {
            for (int i = 0; i < (20 - len-2); i++) {
                System.out.print(" ");

            }
        }


        }

    public static void printStudent(ArrayList list){

        if(list.isEmpty())
            System.out.println("系统学生信息为空");
        else {
            System.out.println("|    学号                 "+ "|    姓名                "+"|    年龄                 "+"|    所在地   ");
            for (int i = 0; i < list.size(); i++) {
                Student s1=(Student) list.get(i);
                //System.out.println("|   "+s1.getSid()+ "|   "+s1.getName()+"|   "+s1.getAge()+"|    "+s1.getAddress()+ "  |");
                System.out.print("|    "+s1.getSid());
                printSpace(s1.getSid().length(),1);
                System.out.print("|    "+s1.getName());
                printSpace(s1.getName().length(),2);
                System.out.print("|    "+s1.getAge());
                printSpace(s1.getAge().length(),1);
                System.out.println("|    "+s1.getAddress());

                //System.out.println(list.get(i).toString());
            }
        }

    }

    public static void changeStudent(String sid, ArrayList list){
        Scanner s=new Scanner(System.in);
        String name,age,address;


       ArrayList list1=findIndex(sid,list);

        if(!(boolean)list1.get(1)) {
            System.out.println("未查找到该学生");
            return;
        }
        System.out.println(list1.get(2));


        System.out.println("请输入学生name");
        name=s.next();
        System.out.println("请输入学生age");
        age=s.next();
        System.out.println("请输入学生address");
        address=s.next();

        Student s1=(Student) list1.get(2);
        s1.setName(name);
        s1.setAge(age);
        s1.setAddress(address);//修改属性


        list.set((int )list1.get(0),s1);//设置学生信息

    }


    public static  void delectStudent(String sid , ArrayList list){

        ArrayList list1=findIndex(sid,list);
        if(!(boolean)list1.get(1)) {
            System.out.println("未查找到该学生");
            return;
        }
        list.remove((int)list1.get(0));//删除该学生信息

    }


    public static ArrayList findIndex(String sid,ArrayList list ){

        boolean flag=false;
        int index=-1;

        ArrayList arr=new ArrayList();

        Student s1 = null;//保存查找到的学生 对象
        for (int i = 0; i <list.size() ; i++) {

            s1= (Student) list.get(i);//Object 转Student
            if(sid.equals(s1.getSid())) {
                //System.out.println(list.get(i));
                arr.add(i);
                arr.add(true);
                arr.add(s1);
                return arr;
            }

        }
        arr.add(-1);
        arr.add(false);
        arr.add(s1);
        return arr;
    }

}
