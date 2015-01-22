package com.chenchi.wechat_manager.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * 将string转化成date
     * @param str
     * @return
     * @throws ParseException
     */
    public static Date StringToDate(String str) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        return date;
    }
}
