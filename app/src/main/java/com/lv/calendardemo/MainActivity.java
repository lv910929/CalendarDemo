package com.lv.calendardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lv.calendardemo.entity.CalendarInfo;
import com.lv.calendardemo.view.GridCalendarView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

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
        list.add(new CalendarInfo(currYear, currMonth, 29, "居家家居团购", CalendarInfo.COLOR_PURPLE));
    }

    private void initUI() {
        calendarView = (GridCalendarView) findViewById(R.id.calendar_view);
        calendarView.setCalendarInfos(list);
    }
}
