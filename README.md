# CalendarDemo
> 自定义的日历控件

#### 简单使用
样式设置：
* colorSelectBG：选中日期的背景色
* colorSelectDay：选中日期的颜色
* colorToday：今天日期颜色
* colorMonthView：日历的整个背景色
* colorWeekday：工作日的颜色
* colorWeekend：周末的颜色
* colorWork：班颜色
* colorDesc：描述文字颜色
* sizeDay：日期大小
* sizeDesc：描述文字大小
* dateHeight：日期高度
* colorLine：线条颜色
* smoothMode：滑动模式，0为有滑动模式，1没有滑动效果。
使用自定义样式就需要分别继承实现日期和周的样式，然后通过方法进行设置。设置日期日历界面的样式 calendarView.setDayTheme(new IDayTheme());

其他功能：
1、 支持点击事件
``` 
calendarView.setDateClick(new MonthView.IDateClick() {
    @Override
    public void onClickOnDate(int year, int month, int day) {
        String text = "点击了:" + year + "-" + month + "-" + day;
        Snackbar.make(activityMain, text, Snackbar.LENGTH_SHORT).show();
    }
});
```

2、 支持事务的添加
```
list.add(new CalendarInfo(currYear, currMonth, 3, "居家家居团购", CalendarInfo.COLOR_ORANGE));
list.add(new CalendarInfo(currYear, currMonth, 11, "居家家居团购", CalendarInfo.COLOR_GREEN));
list.add(new CalendarInfo(currYear, currMonth, 19, "居家家居团购", CalendarInfo.COLOR_YELLOW));
list.add(new CalendarInfo(currYear, currMonth, 24, "居家家居团购", CalendarInfo.COLOR_BLUE));
list.add(new CalendarInfo(currYear, currMonth, 29, "居家家居团购", Color.parseColor("#DD5044")));
calendarView.setCalendarInfos(list);
```

CalendarInfo类字段示意：
* year 事务年份
* month 事务月份
* day 事务日期号
* des 事务描述
* rest 活动日期背景色

#### 截图
![截图](https://github.com/lv910929/CalendarDemo/blob/master/art/screenshot_1.png)

