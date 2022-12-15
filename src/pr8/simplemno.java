package pr8;

public class simplemno
{
    public void mnoj(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    mnoj(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }
    public static void main(String args[])
    {
        simplemno obj = new simplemno();
        obj.mnoj(15);
    }
}
