package jdbc.base.func;

import java.sql.*;
import java.util.Scanner;

//1. 通过键盘录入用户名和密码
//			2. 判断用户是否登录成功
public class Learn7Login {

    public static void main(String[] args) {

        login();

    }



    public static void login(){

        Scanner s=new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=s.nextLine();

        System.out.println("请输入用户名密码");
        String passwd=s.nextLine();

        Connection con = Utils.initial();
        //Statement stm=null;
        PreparedStatement stm=null;
        ResultSet res=null;
        try {
            stm=con.prepareStatement("select * from user where uname= ? and passwd= ?");

            stm.setString(1,name);
            stm.setString(2,passwd);
            res=stm.executeQuery();
//            sql注入问题
            //1 正则表达式 检查解决   2.采用 prepareStatment 解决
/*            String sql="select * from user where uname ='"+name+"' and passwd=  '"+   passwd +   "'   ";
            //select * from user where uname ='asdsad' and passwd='a' or 'a' = 'a'
            System.out.println(sql);
            res=stm.executeQuery(sql);*/

           int count=0;
           while (res.next())
           {
               count++;
           }
           if(count>0)
               System.out.println("登陆成功"+count);

            else
               System.out.println("登陆失败"+count);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Utils.close01(stm,con,res);
        }


    }

}
