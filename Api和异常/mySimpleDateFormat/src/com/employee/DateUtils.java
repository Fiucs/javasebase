package com.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public DateUtils() {
    }
    public static String dateToString(Date date,String fmt)
    //得到date
    {

        SimpleDateFormat smf=new SimpleDateFormat(fmt);
        return smf.format(date);

    }

    public static Date stringToDate(String str,String fmt) throws ParseException {
        SimpleDateFormat smf=new SimpleDateFormat(fmt);
        Date date=smf.parse(str);
        return date;

    }


}
