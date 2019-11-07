package com.employee;

import java.util.Date;

public class Employee {
    private String name;
    private Date startTime;
    private Date endTime;

    public Employee(String name, Date startTime, Date endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "姓名=" + name+'\n'+
                "上班时间=" + DateUtils.dateToString(startTime,"yyyy年MM月dd日 HH时mm分ss秒 ")+
                "\n下班时间=" + DateUtils.dateToString(startTime,"yyyy年MM月dd日 HH时mm分ss秒 ");
    }
}
