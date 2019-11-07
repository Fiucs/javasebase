package jdbctempalte;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.JdbcUtils;
import utils.JDBCutils;

public class JdbcTmpLearn01 {
    public static void main(String[] args) {

//            JdbcTemplate temp=new JdbcTemplate(JDBCutils.getDatsoure());
            JdbcTemplate temp=new JdbcTemplate(new ComboPooledDataSource());

            //调用方法
            String sql="update user set uname=? where id =?";
        int count = temp.update(sql, "喀1喀", 1);
        System.out.println(count);


    }
}
