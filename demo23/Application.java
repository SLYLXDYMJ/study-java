package demo23;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application {
  public static void main (String[] args) {
    // 读取指定时间的的年月日时分秒等信息
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTime(new Date());
    System.out.println(calendar.get(Calendar.YEAR));
    System.out.println(calendar.get(Calendar.MONTH) + 1);
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendar.get(Calendar.MINUTE));
    System.out.println(calendar.get(Calendar.SECOND));

    // 格式化时间显示
    System.out.println(
      new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
        .format(new Date())
    );
  }
}
