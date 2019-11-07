package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutils {


    private static DataSource ds;

    static {

        Properties pro=new Properties();
        try {
            pro.load(JDBCutils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public  static Connection getCon() {

        Connection connection = null;
        try {
            connection = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }

    public static void close(Statement stm,Connection con){
        close(null,stm,con);

    }
    public static void close(ResultSet rset, Statement stm, Connection con){

        if(rset!=null) {
            try {
                rset.close();
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

        if(con!=null)
        {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public static DataSource getDatsoure(){

        return  ds;

    }



}
