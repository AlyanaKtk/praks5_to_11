package pr10;

public class interfacecomparable implements Comparable<interfacecomparable>
{
    int score;
    int id;

    @Override
    public int compareTo(interfacecomparable b) {
        return this.id-b.id;
    }
}
