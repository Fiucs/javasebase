package jdbc.base.func;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Learn1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        //1注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接对象

        //Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?&useSSL=true", "root", "12345dfg");
        Connection connect = DriverManager.getConnection("jdbc:mysql:///db2?&useSSL=true&serverTimezone=GMT", "root", "12345dfg");

        //3.sql
        String sql="update account set balance=500+balance where name='lisi'";

        //4.获取执行sql的对象

        Statement stmt=connect.createStatement();
        //5.执行 sql

        int bl = stmt.executeUpdate(sql);
        //6.打印执行结果
        System.out.println(bl);
        stmt.close();
        connect.close();

    }
}
