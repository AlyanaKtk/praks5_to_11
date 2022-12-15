package pr8;

public class numturn
{
    public static int turn(int n, int i) {
        return (n==0) ? i : turn( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        System.out.println(turn(158, 0));
    }
}
