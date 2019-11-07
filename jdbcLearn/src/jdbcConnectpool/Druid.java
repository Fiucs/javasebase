package jdbcConnectpool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class Druid {

    public static void main(String[] args) throws Exception {

    //        连接池
        //配置文件
//        获取连接池

        Properties pro = new Properties();

        ClassLoader loader = C3p0.class.getClassLoader();//获取类加载器

        String path = loader.getResource("druid.properties").getPath();

//        报错
//        DataSource source = DruidDataSourceFactory.createDataSource(pro.load(new FileInputStream(path)));
        pro.load(new FileInputStream(path));
        DataSource source = DruidDataSourceFactory.createDataSource(pro);
        Connection con = source.getConnection();

        System.out.println(con);


    }
}
