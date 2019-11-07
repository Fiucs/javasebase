package jdbctempalte;

import my.classfile.Emp;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCutils;

import javax.xml.transform.Templates;
import java.sql.JDBCType;
import java.util.List;
import java.util.Map;

public class TmpTestDML {
/*    				1. 修改1号数据的 salary 为 10000
            2. 添加一条记录
				3. 删除刚才添加的记录
				4. 查询id为1的记录，将其封装为Map集合
				5. 查询所有记录，将其封装为List
				6. 查询所有记录，将其封装为Emp对象的List集合
				7. 查询总记录数*/

    public static JdbcTemplate tmp;
    @Before
    public void init(){
        tmp=new JdbcTemplate(JDBCutils.getDatsoure());


    }

    //junit  单元测试 方法独立执行
    @Test
    public void test1(){

        int count = tmp.update("update emp1 set bonus=1000 where id=? ", 1001);
        System.out.println(count);

    }
    @Test
    public void test2(){

//        2. 添加一条记录
        int count=tmp.update("insert into user values (null ,?,?)","试试","ssss");
        System.out.println(count);

    }

    @Test
    public void test3(){

//        3. 删除刚才添加的记录
        int count = tmp.update("delete from user where id=?", 7);
        System.out.println(count);


    }
    @Test
    public void test4(){
//        4. 查询id为1的记录，将其封装为Map集合
        Map<String, Object> map = tmp.queryForMap("select  *from  emp1 where id=?", 1001);
        System.out.println(map);



    }
    @Test
    public void test5(){
        List<Map<String, Object>> list = tmp.queryForList("select  * from emp1");
        list.stream().forEach(System.out::println);


    }
    @Test
    public void test6(){
//        6. 查询所有记录，将其封装为Emp对象的List集合

//        返回一个对象
//        Emp emp = tmp.queryForObject("select *from emp1", new BeanPropertyRowMapper<Emp>(Emp.class));
        List<Emp> empList = tmp.query("select * from emp1", new BeanPropertyRowMapper<>(Emp.class));

        System.out.println(empList);

        //        tmp.query()

    }




}
