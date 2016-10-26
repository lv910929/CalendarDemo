package com.lv.calendardemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;

import com.lv.calendardemo.theme.DefaultDayTheme;

public class GridMonthView extends MonthView {

    public GridMonthView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void drawLines(Canvas canvas, int rowsCount) {
        int rightX = getWidth();
        int BottomY = getHeight();
        int rowCount = rowsCount;
        int columnCount = 7;
        Path path;
        float startX = 0;
        float endX = rightX;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(theme.colorLine());
        for (int row = 1; row <= rowCount; row++) {
            float startY = row * rowSize;
            path = new Path();
            path.moveTo(startX, startY);
            path.lineTo(endX, startY);
            canvas.drawPath(path, paint);
        }

        float startY = 0;
        float endY = BottomY;
        for (int column = 1; column < columnCount; column++) {
            startX = column * columnSize;
            path = new Path();
            path.moveTo(startX, startY);
            path.lineTo(startX, endY);
            canvas.drawPath(path, paint);
        }
    }

    @Override
    protected void drawBG(Canvas canvas, int column, int row, int day) {
        if (day == selDay) {
            //绘制背景色矩形
            float startRecX = columnSize * column + 1;
            float startRecY = rowSize * row + 1;
            float endRecX = startRecX + columnSize - 2 * 1;
            float endRecY = startRecY + rowSize - 2 * 1;
            paint.setColor(theme.colorSelectBG());
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(startRecX, startRecY, endRecX, endRecY, paint);
        }
    }

    @Override
    protected void drawDecor(Canvas canvas, int column, int row, int year, int month, int day) {
        if (calendarInfos != null && calendarInfos.size() > 0) {
            if (TextUtils.isEmpty(iscalendarInfo(year, month, day))) return;
            paint.setColor(theme.colorDecor());
            paint.setStyle(Paint.Style.FILL);
            float startRecX = columnSize * column + 1;
            float startRecY = rowSize * row + 1;
            float endRecX = startRecX + columnSize - 2 * 1;
            float endRecY = startRecY + rowSize - 2 * 1;
            canvas.drawRect(startRecX, startRecY, endRecX, endRecY, paint);
        }
    }

    @Override
    protected void drawText(Canvas canvas, int column, int row, int year, int month, int day) {
        paint.setTextSize(theme.sizeDay());
        float startX = columnSize * column + (columnSize - paint.measureText(day + "")) / 2;
        float startY = rowSize * row + rowSize / 2 - (paint.ascent() + paint.descent()) / 2;
        paint.setStyle(Paint.Style.STROKE);
        String des = iscalendarInfo(year, month, day);
        if (day == selDay) {//日期为选中的日期
            if (!TextUtils.isEmpty(des)) {//desc不为空的时候
                int dateY = (int) (startY - 10);
                paint.setColor(theme.colorSelectDay());
                canvas.drawText(day + "", startX, dateY, paint);

                paint.setTextSize(theme.sizeDesc());
                int priceX = (int) (columnSize * column + (columnSize - paint.measureText(des)) / 2);
                int priceY = (int) (startY + 15);
                canvas.drawText(des, priceX, priceY, paint);
            } else {//des为空的时候
                paint.setColor(theme.colorSelectDay());
                canvas.drawText(day + "", startX, startY, paint);
            }
        } else if (day == currDay && currDay != selDay && currMonth == selMonth) {//今日的颜色，不是选中的时候
            //正常月，选中其他日期，则今日为红色
            paint.setColor(theme.colorToday());
            canvas.drawText(day + "", startX, startY, paint);
        } else {
            if (!TextUtils.isEmpty(des)) {//没选中，但是desc不为空
                int dateY = (int) (startY - 10);
                paint.setColor(theme.colorWeekday());
                canvas.drawText(day + "", startX, dateY, paint);

                paint.setTextSize(theme.sizeDesc());
                paint.setColor(theme.colorDesc());
                int priceX = (int) (columnSize * column + Math.abs((columnSize - paint.measureText(des)) / 2));
                int priceY = (int) (startY + 15);
                canvas.drawText(des, priceX, priceY, paint);
            } else {//des为空
                paint.setColor(theme.colorWeekday());
                canvas.drawText(day + "", startX, startY, paint);
            }
        }
    }

    @Override
    protected void createTheme() {
        theme = new DefaultDayTheme();
    }
}
