package com.lv.calendardemo.entity;

import android.graphics.Color;

public class CalendarInfo {

    public static final int COLOR_ORANGE = Color.parseColor("#F6AC2B");// #F6AC2B
    public static final int COLOR_GREEN = Color.parseColor("#69C2B1");// #69C2B1
    public static final int COLOR_YELLOW = Color.parseColor("#EADB00");// #EADB00
    public static final int COLOR_BLUE = Color.parseColor("#5E97BE");// #5E97BE
    public static final int COLOR_PURPLE = Color.parseColor("#925DA3");// #925DA3

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
     * 活动日期背景色
     */
    public int rest;

    /**
     * 构造函数
     *
     * @param year  事务年份
     * @param month 事务月份
     * @param day   事务日期号
     * @param des   事务描述
     * @param rest  活动日期背景色
     */
    public CalendarInfo(int year, int month, int day, String des, int rest) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.des = des;
        this.rest = rest;
    }
}
