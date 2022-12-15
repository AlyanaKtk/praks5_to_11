package pr11;
import java.util.*;
import java.text.DateFormat;
public class student
{
    String name;
    String surname;
    int course;
    String speciality;
    int score;
    String group;
    Date birth;
    public student(Date birth)
    {
        this.birth = birth;
    }
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String toString(int format) {
        String birthStr;
        DateFormat df = switch (format) {
            case (1) -> DateFormat.getDateInstance(DateFormat.SHORT);
            case (2) -> DateFormat.getDateInstance(DateFormat.MEDIUM);
            default -> DateFormat.getDateInstance(DateFormat.LONG);
        };
        return "Birth date is: " + df.format(this.birth);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, sc.nextInt());
        calendar.set(Calendar.MONTH, sc.nextInt()-1);
        calendar.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        student s = new student(calendar.getTime());
        System.out.println(s.toString(1));
        System.out.println(s.toString(2));
        System.out.println(s.toString(3));

    }
}
