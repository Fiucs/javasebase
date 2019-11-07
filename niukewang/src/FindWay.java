import java.util.Scanner;
//链接：https://www.nowcoder.com/questionTerminal/fc72d3493d7e4be883e931d507352a4a
//来源：牛客网
//
//牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
//
//输入描述:
//每个输入包含一个测试用例。
//每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
//接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。
public class FindWay {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String[] ways={"W","N","E","S"};
        int turnNum=s.nextInt();
        s.nextLine();
        String turnWays=s.nextLine();

        String[] arr = turnWays.split("");
        int startWay=1;
        if(arr.length!=turnNum)
            return;

        for (String s1 : arr) {
            if(s1.equals("L"))
             startWay--;
            else
                startWay++;

        }

        int resWay=startWay>=0?startWay%4:(4-(Math.abs(startWay)%4))%4 ;
        System.out.println(ways[resWay]);



    }
}
