package jdbc.base.func;

import my.classfile.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Leran6MultiApply {

    public static void main(String[] args) {

        List<Emp> listEmps=new ArrayList<Emp>();
        listEmps=findAll(listEmps);
        System.out.println(listEmps);
        System.out.println(listEmps.size());

    }

    public static<T>  List<T> findAll(List<T> list ){
        Connection con = Utils.initial();
        Statement stm=null;
        ResultSet result=null;
       // List<Emp> listEmps=new ArrayList<Emp>();
        try {

            stm= con.createStatement();

            String sql="select*from emp1";


            result= stm.executeQuery(sql);

            while (result.next()){
                int id = result.getInt("id");
                String ename = result.getString("ename");
                int job_id = result.getInt("job_id");
                int mgr = result.getInt("mgr");
                Date joindate = result.getDate("joindate");
                double salary = result.getDouble("salary");
                double bonus = result.getDouble("bonus");
                int dept_id = result.getInt("dept_id");


                Emp emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                list.add((T) emp);


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Utils.close01(stm,con,result);
        }

        return list;
    }



}
