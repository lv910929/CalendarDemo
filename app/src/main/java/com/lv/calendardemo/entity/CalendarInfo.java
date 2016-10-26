package com.lv.calendardemo.entity;

public class CalendarInfo {
    /**
     * 年
     */
    public int year;
    /**
     * 月
     */
    public int month;
    /**
     * 日
     */
    public int day;
    /**
     * 描述词
     */
    public String des;

    /**
     * 构造函数
     *
     * @param year  事务年份
     * @param month 事务月份
     * @param day   事务日期号
     * @param des   事务描述
     */
    public CalendarInfo(int year, int month, int day, String des) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.des = des;
    }
}
