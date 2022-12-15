package pr8;

public class twozeroes
{
    int zeroes(int a, int b) {
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return zeroes(a, b - 1) + zeroes(a - 1, b - 1);
    }
    public static void main(String[]args)
    {
        twozeroes obj = new twozeroes();
        System.out.println(obj.zeroes(5, 6));
    }

}
