package jdbc.base.func;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Learn2excuteUpdate {
/*
1. account表 添加一条记录
		2. account表 修改记录
				3. account表 删除一条记录*/
public static void main(String[] args) {

    Statement stm=null;
    Connection connect=null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String sql="insert into account values(null,'的阿部',7000)";//乱码问题
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?&" +
                "serverTimezone=GMT&useSSL=false", "root", "12345dfg");

         stm= connect.createStatement();

        int count = stm.executeUpdate(sql);//ying xiang 行数
        if(count>0)
        System.out.println("影响行数"+count);
        else
            System.out.println("添加失败");


    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    finally {

        if(stm!=null) {
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connect!=null) {
            try {
                connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }




    }


}


}
