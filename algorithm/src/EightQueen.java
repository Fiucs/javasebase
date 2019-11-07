public class EightQueen {


    //定义一维数组
    private int [] pos;//用于保存已经存放的 棋子的位置  其中[下标]代表 行  ,pos[下标]存[列]值
    private int map;//代表摆放的方法数

    public EightQueen() {


        pos=new int[8];
        for (int i = 0; i < pos.length; i++) {
            pos[i]=-1;//列初始化为 -1

        }
        map=0;//方法个数初始化为0

    }

    public static void main(String[] args) {

        EightQueen eightQueen = new EightQueen();

        System.out.println("八皇后问题-递归+回溯思想");
        eightQueen.eightQueen(0);
        System.out.println("map:"+eightQueen.map);
        //从第一行开始摆放  直到摆满八颗棋子  map++，也可以打印出来。此时回溯到上一层递归函数（此时递归层数为8层），
        // 清除该层递归（此时递归为7层）的pos[]值，列数++ 进行--判断操作--  确定是否摆放棋子，
        //若摆放 则又进入下一层递归  ，再次判断是否满足摆放条件


    }

    public boolean checkPos(int row,int [] pos,int cow){
        if(pos[row]!=-1)
            return false;

        for (int i = 0; i < row; i++) {
            if(pos[i]==cow)//判断列
                return false;

        }



        for (int i = 0; i < row; i++) {
            double cow1=pos[i];
            double row1=i;
            if(Math.abs((row1 -row)/(cow1-cow))==1.0)//判断斜率 绝对值 是否为1
            {
                return false;

            }

        }
        return true;






    }
    public void eightQueen(int row) {
        if (row > 7) {
            map++;
            //可添加打印语句
            System.out.println("ok");
            return;

        } else {

            //遍历每一列
            for (int cow = 0; cow < 8; cow++) {
                if (checkPos(row,pos,cow))//如果【满足条件】条件是 同行无棋子 &&同列无棋子  &&左上斜角无棋子 && 右上斜角无棋子 摆起子  进入下一层递归
                {

                    pos[row]=cow;
                    eightQueen(row+1);
                    pos[row]=-1;//清除这一层已摆放的棋子位置   准备返回上一层


                }


            }


        }


    }


}
