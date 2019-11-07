package homwork101;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//2、给出两个字符串集合，求出两个集合的交集、并集并打印
//例如：集合1中元素分别为java、html、css、sql、javaScript
//                    集合2中元素分别为html、css、pytho、go
//                    则交集为html  css    并集为java、html、css、sql、javaScript、pytho、go
public class AndOr {
    public static void main(String[] args) {
        String []s1={"java","html","css","sql","javaScript"};
        String []s2={"html","css","python","go"};
        HashMap<String,Integer>hmap=new HashMap<String, Integer>();

        //1 添加S1元素
        for (String s : s1) {
            hmap.put(s,-1);
        }
        //2
        for (String s : s2) {
            if(hmap.get(s)!=null)
            {
                hmap.put(s,1);//交集
            }
            else
                hmap.put(s,-1);

        }

        Set<Map.Entry<String,Integer>> set =hmap.entrySet();

        System.out.println("并集:");
        for (Map.Entry<String, Integer> entry : set) {
            System.out.print(entry.getKey()+" ");

        }
        System.out.println();
        System.out.println("交集:");
        for (Map.Entry<String, Integer> entry : set) {
            if (entry.getValue()==1)
            System.out.print(entry.getKey()+" ");

        }
        System.out.println();

    }
}
