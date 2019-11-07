package jdbc.base.func;

import java.sql.*;

public class Learn5query {

    public static void main(String[] args) {


        Connection connect=null;
        Statement stm=null;
        ResultSet res=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?&useSSL=false" +
                    "&serverTimezone=GMT","root","12345dfg");

            stm = connect.createStatement();
            String sql="select* from account";

             res = stm.executeQuery(sql);


            while (res.next())
             {
                 int id = res.getInt("id");
                 String name = res.getString("name");
                 double balance = res.getDouble("balance");
                 System.out.println(id+"  "+ name+"  "+ balance );
             }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

            if(res!=null)
            {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }


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
