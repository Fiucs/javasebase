import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSonStrlen {

    //给定一个字符串,请你找出其中不含有重复字符的最长子串的长度。

        //输入: "abcabcbb"
//    输出: 3
//    解释:因为无重复字符的最长子串是"abc"， 所以其长度为3。


    public static void main(String[] args) {

        countNum();

    }

    public static void countNum(){
        String s="abcabcdaaxabc";
        char[] chars = s.toCharArray();//拆分
        List<Character> list=new ArrayList<>();
        int count=0;
        for (int i = 0; i <chars.length ; i++) {

            if(count>=chars.length-i)
                break;//此时不必再遍历了
            for (int pos =i ; pos <chars.length ; pos++) {

                if(!list.contains(chars[pos]))
                {
                    list.add(chars[pos]);
                }
                else
                    //    统计长度
                    break;//重复出现
            }

            if(list.size()>count)
                count=list.size();//更新长度
            list.clear();

        }

        System.out.println("字串最长长度:"+count);


    }


}
