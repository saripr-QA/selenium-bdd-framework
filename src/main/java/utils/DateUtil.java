package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String getTimeStamp() {

        return new SimpleDateFormat("ddMMyyyyHHmmss")
                .format(new Date());
    }
}