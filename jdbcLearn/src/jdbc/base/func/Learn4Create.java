package jdbc.base.func;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Learn4Create {

    public static void main(String[] args) {


        Connection connect=null;
        Statement stm=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?&useSSL=true&" +
                    "serverTimezone=GMT","root","12345dfg");

            stm = connect.createStatement();
            String sql="create table if not exists student(id int primary  key " +
                    ",name varchar(20)) ";

            int count = stm.executeUpdate(sql);
//            System.out.println(count>0?"成功:"+count:"失败");
            System.out.println(count);


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
