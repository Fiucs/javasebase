package job;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private Date birth;

    public Person(String name, String birth) {
        this.name = name;
        this.birth = strToDate(birth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "姓名:"+name+"   "+ "出生日期:"+dateToStr(birth);
    }

    public static Date  strToDate(String str){

        String strFomat="yyyy.MM.dd";

        SimpleDateFormat std=new SimpleDateFormat(strFomat); //得到格式

        Date date;
        try {
             date = std.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;


    }

    public static String  dateToStr(Date date){

        String strFomat="yyyy.MM.dd";
        SimpleDateFormat std=new SimpleDateFormat(strFomat); //得到格式

        return std.format(date);

    }

}
