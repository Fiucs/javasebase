package jdbcConnectpool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class JdbcConPool {

    //连接池
    //2.高校
    //3.节约资源


    //使用
    //DataSoure 接口  数据库厂商实现
        //拿取去容器 连接器   getConnection()
       //归还  连接器: close()  优先使用连接池的放法
    //1.C3P0  数据库连接池技术
    //2.Druid :阿里巴巴提供的

    public static void main(String[] args) throws Exception {



    }


}
