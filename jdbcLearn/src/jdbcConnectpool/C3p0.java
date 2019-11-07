package jdbcConnectpool;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0 {
    public static void main(String[] args) throws SQLException {

//        ComboPooledDataSource comb = new ComboPooledDataSource();
//        Connection con = comb.getConnection();

        Thread thread = new Thread(C3p0::test);
        thread.start();

    }

    public static void test()  {

        DataSource comb = new ComboPooledDataSource();
        try {Connection con = comb.getConnection();

            for (int i = 1; i <=11 ; i++) {

                System.out.println(i+" :"+con);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }


}
