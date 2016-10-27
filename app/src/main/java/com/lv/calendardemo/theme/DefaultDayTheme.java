package com.lv.calendardemo.theme;

import android.graphics.Color;

public class DefaultDayTheme implements IDayTheme {

    @Override
    public int colorSelectBG() {
        return Color.parseColor("#FFFFFF");
    }

    @Override
    public int colorSelectDay() {
        return Color.parseColor("#FFFFFF");
    }

    @Override
    public int colorMonthView() {
        return Color.parseColor("#FFFFFF");
    }

    @Override
    public int colorWeekday() {
        return Color.parseColor("#404040");
    }

    @Override
    public int colorWork() {
        return Color.parseColor("#FF9B12");
    }

    @Override
    public int colorDesc() {
        return Color.parseColor("#FF9B12");
    }

    @Override
    public int sizeDay() {
        return 20;
    }

    @Override
    public int sizeDesc() {
        return 15;
    }

    @Override
    public int dateHeight() {
        return 70;
    }

    @Override
    public int colorLine() {
        return Color.parseColor("#CBCBCB");
    }

    @Override
    public int smoothMode() {
        return 0;
    }
}
