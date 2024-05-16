package DateClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat df = new SimpleDateFormat("M/d/yyyy hh:mm:ss");

        System.out.println(sdf.format(date));
        System.out.println(df.format(date));
        System.out.println(date.toString());
    }
}
