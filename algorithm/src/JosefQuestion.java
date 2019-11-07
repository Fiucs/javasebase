import java.util.ArrayList;

public class JosefQuestion {

    //     1,2,3,4,5 5个人轮流报数 数到三淘汰  问那个人会获胜
    // 下标 00,1,20,30,40   ,5,6,7,8
    //1
    //00 10 20 3 40 50 60
    //00 10 20 30 40 50 6 70 80
    public static void main(String[] args) {

        for (long i = 1; i <= 1000; i++) {
        }
          //  josefQuestion(10000);

        System.out.println(1+ysfdigui(10000,3));




    }
    public  static boolean isOut(long i,ArrayList list){

        for (int j = 0; j <list.size(); j++) {
             if(i==(long)list.get(j))
             {
                 return true;
             }

        }
        return false;
    }
    public static void josefQuestion(long n){

        if(n<=0)
            return;
        ArrayList list=new ArrayList();//记录已经被淘汰的下标
        long count =n;//记录还剩的人数
        //下标为n-1;
        long index=0;//从0下标开始
        int num=1;//初始化报数
        while (count>0)
        {
            if(index==n)
                index=0;
            else {
                if(!isOut(index,list)){

                    if (num%3==0)
                    {
                        if(count!=1)
                        System.out.println("kill "+(index+1));
                        list.add(index);
                        num++;
                        count--;
                        index++;
                    }
                    else {
                        num++;
                        index++;

                    }

                }
                else {

                    index++;

                }

            }

        }
      // while () 推出后index已经++了

        System.out.println(n+"个人中的胜利者为第："+index+"号");

    }


    public  static int ysfdigui(long num,long value){
        //F(1)=0  编号0cunhuo           ....0
        //F(2)=(F(1)+vale)%num  0 1  .....1
        //F(3)=(F(2)+Value)%num 0 1 2 .....0+1+3 % 3  =1

        if(num==1)
            return 0;
        else return (int) ((ysfdigui(num-1,value)+value)%num);


    }
}
