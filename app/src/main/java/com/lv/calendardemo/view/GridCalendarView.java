package com.lv.calendardemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lv.calendardemo.R;
import com.lv.calendardemo.entity.CalendarInfo;
import com.lv.calendardemo.theme.IDayTheme;

import java.util.List;

public class GridCalendarView extends LinearLayout implements View.OnClickListener {

    private GridMonthView gridMonthView;
    private TextView textViewYear, textViewMonth;

    public GridCalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.VERTICAL);
        LayoutParams llParams =
                new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        View view = LayoutInflater.from(context).inflate(R.layout.display_grid_date, null);
        gridMonthView = new GridMonthView(context, null);
        addView(view, llParams);
        addView(gridMonthView, llParams);

        view.findViewById(R.id.left).setOnClickListener(this);
        view.findViewById(R.id.right).setOnClickListener(this);
        textViewYear = (TextView) view.findViewById(R.id.year);
        textViewMonth = (TextView) view.findViewById(R.id.month);
        textViewYear.setText(gridMonthView.getCurrYear() + "年");
        textViewMonth.setText((gridMonthView.getCurrMonth() + 1) + "月");
        gridMonthView.setMonthLisener(new MonthView.IMonthLisener() {
            @Override
            public void setTextMonth() {
                textViewYear.setText(gridMonthView.getSelYear() + "年");
                textViewMonth.setText((gridMonthView.getSelMonth() + 1) + "月");
            }
        });
    }

    /**
     * 设置日历点击事件
     *
     * @param dateClick
     */
    public void setDateClick(MonthView.IDateClick dateClick) {
        gridMonthView.setDateClick(dateClick);
    }

    public void setCalendarInfos(List<CalendarInfo> calendarInfos) {
        gridMonthView.setCalendarInfos(calendarInfos);
    }

    public void setDayTheme(IDayTheme theme) {
        gridMonthView.setTheme(theme);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.left) {
            gridMonthView.onLeftClick();
        } else {
            gridMonthView.onRightClick();
        }
    }
}