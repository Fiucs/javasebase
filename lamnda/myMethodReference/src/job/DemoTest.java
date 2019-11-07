package job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoTest {


    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("浏阳河", "1840.5.6"));//Date(1998,6,7);直接构造方法赋值 从1970开始
        list.add(new Person("木工河", "1847.1.6"));
        list.add(new Person("黄河", "2020.7.10"));
        list.add(new Person("旭水河", "2012.5.15"));
        list.add(new Person("都江堰", "2001.9.12"));

       // Comparator<Person> comparator = Comparator.comparing(Person::getBirth);
        userSort(Collections::sort, list, SortPersonDemo::compareByBirth);


    }

    //调用 Collections.sort方法

    public static void userSort(SortInner s, ArrayList<Person> list, Comparator<Person> comparator) {

        s.sortList(list, comparator);
        for (Person person : list) {
            System.out.println(person);
        }

    }

}
class SortPersonDemo {

    public void c(){}
    //该方法实现了 comparator接口的compare方法
    public static int compareByBirth(Person p1, Person p2)
    {
        return p2.getBirth().compareTo(p1.getBirth());
    }

}