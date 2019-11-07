package homwork101;

import java.io.*;
//打印1到100之内的整数，但数字中包含7的要跳过，并且换行，并将结果写入到D:\numberwithout7.txt文件中
//格式如下：
public class FilltterNum {
    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new FileReader("algorithm\\src\\homwork101\\res.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("algorithm\\src\\homwork101\\res.txt"));

        int n=100;
        for (int i = 1; i <=n; i++) {
                if (i%10==7 || i/10==7)
                {
                    if((i+1)%10==7 || (i+1)/10==7)
                        continue;
                    bw.write("\n");
                }
                else
                {
                    bw.write(i+" ");
                }

        }
        bw.flush();
        bw.close();


    }
}
