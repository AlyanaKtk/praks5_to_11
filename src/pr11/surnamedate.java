package pr11;

import java.util.*;

public class surnamedate {
    public static void main(String[] args) throws InterruptedException {
        Calendar c = new GregorianCalendar();
        c.setTimeInMillis(System.currentTimeMillis());
        c.add(Calendar.MONTH, -1);
        Date date = c.getTime();
        Date dateNow = new Date();
        System.out.println("Developer surname: Katkova");
        System.out.println("Task received at: " + date);
        System.out.println("Task done at: " + dateNow);
    }
}