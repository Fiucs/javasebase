package jdbcConnectpool;

import utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testall {
    public static void main(String[] args) {

        Connection con = JDBCutils.getCon();
        PreparedStatement stm=null;
        try {
            stm = con.prepareStatement("insert into USER (uname,passwd) values (?,?);");

            stm.setString(1,"武术家");
            stm.setString(2,"wushujia");
            stm.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCutils.close(stm,con);

        }


    }
}
