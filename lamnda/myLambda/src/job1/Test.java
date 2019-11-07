package job1;

import java.util.ArrayList;

public class Test {

  public static   ArrayList<Employee> list=new ArrayList<>();

    public static void main(String[] args) {


        list.add(new Employee("001","孙权",35,1000,"指挥部"));
        list.add(new Employee("002","刘备",50,3000,"后勤部"));
        list.add(new Employee("003","曹操",45,5000,"战斗部"));


        //过滤 2000一下的
        show(list1 -> {

            System.out.println("//过滤 2000一下的");
            for (Employee employee : list1) {


                if(employee.getSalary()>=2000)
                    System.out.println(employee);
            }

            System.out.println("//过滤战斗部");
            for (Employee employee : list) {

                if(!"战斗部".equals(employee.getDepartment()))
                    System.out.println(employee);

            }

        });

        int count=0;
        while(true){
            System.out.println("fuck you xunmazheng 忍  :"+(++count));
        }



    }

    public static void  show(Operate operate){

        operate.op(list);
    }


}
