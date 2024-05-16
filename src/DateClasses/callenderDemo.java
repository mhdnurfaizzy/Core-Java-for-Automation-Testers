package DateClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class callenderDemo {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("M/d/yyyy hh:mm:ss");

        System.out.println(df.format(c.getTime()));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.AM_PM));
        System.out.println(c.get(Calendar.MINUTE));


    }
}
