package pr7.pr61;
import java.math.*;
public class mathfunc implements mathcalulable
{
    double real;
    double img;
    mathfunc(double real, double img)
    {
        this.img = img;
        this.real = real;
    }
    @Override
    public double modul()
    {
        return Math.sqrt(real*real + img*img);
    }

    @Override
    public void powof(int st)
    {
        double mod = modul();
        double rcos = Math.cos(real/mod);
        double rsin = Math.sin(img/mod);
        mod = Math.pow(mod, st);
        rcos = Math.cos(rcos*st);
        rsin = Math.sin(rsin*st);
        System.out.print(mod + "(" + rcos + " + i" + rsin + ")");
    }
    public double length(double radius)
    {
        return 2*pi*radius;
    }
    public static void main(String args[])
    {
        mathcalulable mc = new mathfunc(12.3, 15.4);
        System.out.println(mc.modul());
        mc.powof(3);

    }
}
