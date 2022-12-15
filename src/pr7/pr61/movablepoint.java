package pr7.pr61;

public class movablepoint implements Movable
{
    int x;
    int y;
    int xspeed;
    int yspeed;
    movablepoint(){};
    movablepoint(int x, int y, int xspeed, int yspeed)
    {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void moveup() {
        y++;
    }

    @Override
    public void movedown() {
        y--;
    }

    @Override
    public void moveleft() {
        x--;
    }

    @Override
    public void moveright() {
        x++;
    }
    public boolean speedtest(int xspeed, int yspeed)
    {
        if (xspeed == yspeed)
            return true;
        else
        {
            return false;
        }
    }
}
