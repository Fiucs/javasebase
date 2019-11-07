import java.util.ArrayList;

public class CharChangeQuestion {
    //输入字符串  "1a2"
    //输出       "1a2","aA2"

    //输入字符串  "2ab"
    //输出字符串  "2ab","2Ab","2AB","2aB"

    //给定一个字符串，将其大小写字母互转，并列出全部结果


    //step
    //返回条件 若此时位置大于了  字符串的长度就输出此时结果，回退到上一层递归函数


    //递归体
    private int index;
    private ArrayList list;
    private int count;//统计个数


    public CharChangeQuestion(int index, ArrayList list,int count) {
        this.index = index;
        this.list = list;
        this.count=count;
    }

    public CharChangeQuestion() {

        index=0;
        list=new ArrayList();
        count=0;
    }


    public static void main(String[] args) {

/*        ArrayList list =new ArrayList();
        list.add('a');
        list.add("b");
        list.add("c");
        list.add("d");

        String str=String.join("",list);//静态方法
        System.out.println(str);*/
        CharChangeQuestion c=new CharChangeQuestion();

        c.transfer("qwertyuioplmnbvcxzasdfghjk",c.index,c.list);



    }


    public void transfer(String strNow, int index, ArrayList list) {



        if (index == strNow.length()) {


            count++;
            String str=String.join("",list);
            System.out.println(str+"个数："+count);
            //d打印
            return;

        } else {

            if (!Character.isLetter(strNow.charAt(index))) //判断是否时数字
            {

                list.add(String.valueOf(strNow.charAt(index)));
                transfer(strNow, index + 1, list);
                list.remove(index);

            } else {
                //先转大写字母
                char chl = Character.toUpperCase(strNow.charAt(index));
                list.add(String.valueOf(chl));
                transfer(strNow, index + 1, list);

                //此时要清除这层在list中的最后一个元素
                list.remove(index);

                // 此时深层递归回到该层递归   再转为小写字母

                char chu = Character.toLowerCase(strNow.charAt(index));
                list.add(String.valueOf(chu));
                transfer(strNow, index + 1, list);
                list.remove(index);
            }


        }


    }


}
