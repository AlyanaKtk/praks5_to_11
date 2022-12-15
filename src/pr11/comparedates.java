package pr11;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class comparedates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        Date nowTime = new Date();
        System.out.println("Введите год, месяц, день");
        calendar.set(Calendar.YEAR, sc.nextInt());
        calendar.set(Calendar.MONTH, sc.nextInt()-1);
        calendar.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        Date userTime = calendar.getTime();
        System.out.println("Введенная дата "+((userTime.getTime() < nowTime.getTime())? "раньше" : "позже") + " текущей");
    }
}
