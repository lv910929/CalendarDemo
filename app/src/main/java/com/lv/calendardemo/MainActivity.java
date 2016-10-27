package com.lv.calendardemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.lv.calendardemo.entity.CalendarInfo;
import com.lv.calendardemo.view.GridCalendarView;
import com.lv.calendardemo.view.MonthView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout activityMain;
    private GridCalendarView calendarView;

    private List<CalendarInfo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initUI();
    }

    private void initData() {
        Calendar calendar = Calendar.getInstance();
        int currYear = calendar.get(Calendar.YEAR);
        int currMonth = calendar.get(Calendar.MONTH) + 1;
        list = new ArrayList<>();
        list.add(new CalendarInfo(currYear, currMonth, 3, "居家家居团购", CalendarInfo.COLOR_ORANGE));
        list.add(new CalendarInfo(currYear, currMonth, 11, "居家家居团购", CalendarInfo.COLOR_GREEN));
        list.add(new CalendarInfo(currYear, currMonth, 19, "居家家居团购", CalendarInfo.COLOR_YELLOW));
        list.add(new CalendarInfo(currYear, currMonth, 24, "居家家居团购", CalendarInfo.COLOR_BLUE));
        list.add(new CalendarInfo(currYear, currMonth, 29, "居家家居团购", Color.parseColor("#DD5044")));
    }

    private void initUI() {
        activityMain = (RelativeLayout) findViewById(R.id.activity_main);
        calendarView = (GridCalendarView) findViewById(R.id.calendar_view);
        calendarView.setCalendarInfos(list);
        calendarView.setDateClick(new MonthView.IDateClick() {
            @Override
            public void onClickOnDate(int year, int month, int day) {
                String text = "点击了:" + year + "-" + month + "-" + day;
                Snackbar.make(activityMain, text, Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
