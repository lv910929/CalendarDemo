package com.lv.calendardemo.theme;

public interface IDayTheme {
    /**
     * 选中日期的背景色
     *
     * @return 16进制颜色值 hex color
     */
    public int colorSelectBG();

    /**
     * 选中日期的颜色
     *
     * @return 16进制颜色值 hex color
     */
    public int colorSelectDay();

    /**
     * 日历的整个背景色
     *
     * @return
     */
    public int colorMonthView();

    /**
     * 工作日的颜色
     *
     * @return
     */
    public int colorWeekday();

    /**
     * 事务装饰颜色
     *
     * @return 16进制颜色值 hex color
     */
    public int colorDecor();

    /**
     * 班颜色
     *
     * @return 16进制颜色值 hex color
     */
    public int colorWork();

    /**
     * 描述文字颜色
     *
     * @return 16进制颜色值 hex color
     */
    public int colorDesc();

    /**
     * 日期大小
     *
     * @return
     */
    public int sizeDay();

    /**
     * 描述文字大小
     *
     * @return
     */
    public int sizeDesc();

    /**
     * 日期高度
     *
     * @return
     */
    public int dateHeight();

    /**
     * 线条颜色
     *
     * @return
     */
    public int colorLine();

    /**
     * 滑动模式  0是渐变滑动方式，1是没有滑动方式
     *
     * @return
     */
    public int smoothMode();

    /**
     * 橙色
     *
     * @return
     */
    public int colorOrange();

    /**
     * 绿色
     *
     * @return
     */
    public int colorGreen();

    /**
     * 黄色
     *
     * @return
     */
    public int colorYellow();

    /**
     * 蓝色
     *
     * @return
     */
    public int colorBlue();

    /**
     * 紫色
     *
     * @return
     */
    public int colorPurple();
}
