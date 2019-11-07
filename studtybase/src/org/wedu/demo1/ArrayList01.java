package org.wedu.demo1;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        Arraytest01();
        Arraytest02();
    }

    public static void Arraytest01(){

         Phone p1 =new Phone();

        System.out.println(p1.toString());
        ArrayList arrList=new ArrayList();
        //向列表中添加元素
        arrList.add(true);
        arrList.add("1024");
        arrList.add(2048);
        arrList.add(123);
        arrList.add(p1);
        arrList.add(new org.wedu.homework.Phone("huawei",4999,"blue"));

        Object o=arrList.get(0);
        System.out.println(o);
        o=arrList.get(arrList.size()-1);//size() 返回list中元素的个数

        System.out.println(o); //输入对象 默认调用toString()

        arrList.add(1,999);//在index位置之前添加元素
        System.out.println(arrList.get(1));

        arrList.set(0,false);
        System.out.println(arrList.get(0));

        //arrList.remove(p1);
        System.out.println(arrList.get(6));


    }
    public static void Arraytest02(){
        ArrayList arrayList=new ArrayList();
        Student s1 = new Student("傻子", 9527);
        arrayList.add(s1);
        arrayList.add(new Student("猴子",2333));
        arrayList.add(new Student("唐僧肉",4999));
        arrayList.add(new Student("神厨小福贵",2948));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }

    }




}
