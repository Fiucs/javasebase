package jdbc.base.func;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class Utils {
        private static String url;
        private static String user;
        private static String passwd;
        private static String mysqlJar;

   static  {

            Properties pro=new Properties();

            ClassLoader classLoader = Utils.class.getClassLoader();//获取类加载器对象
           // URL res = classLoader.getResource("jdbc.properties");
           // String path=res.getPath();
            try {
              //  pro.load(new FileReader(path));
                pro.load(classLoader.getResourceAsStream("jdbc.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }

          //  System.out.println(path);

             mysqlJar = pro.getProperty("mysqlJar");
             url = pro.getProperty("url");
             user = pro.getProperty("user");
             passwd = pro.getProperty("passwd");

        }



    public static Connection  initial()//初始化  返回一个连接
    {

        try {
            Class.forName(mysqlJar);//注册驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;


    }

    public static void  close01(Statement stm,Connection con){

            if(stm!=null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        if(con!=null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public static void  close01(Statement stm, Connection con, ResultSet res)
    {

        if(res!=null) {
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


        if(con!=null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }















}
