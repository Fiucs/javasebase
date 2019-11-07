
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class removeListSameElement {


    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(1);
        list.add(11);
        list.add(11);
        list.add(15);
        list.add(18);
        list.add("str");
        list.add("str1");
        list.add("str");

        System.out.println(list);

        ArrayList newList= (ArrayList) removeListElements(list);
        System.out.println(newList);



    }


    //基本数据类型可以去重 不保证引用数据类型
    public static List removeListElements(List list){



        LinkedHashSet set=new LinkedHashSet(list);//构造方法 接受集合 初始化

        ArrayList newList = new ArrayList(set);
        return newList;

    /*    for (Object o : list) {
            set.add(o);

        }

        for (Object o : set) {

            newList.add(o);
        }*/



    }


}
