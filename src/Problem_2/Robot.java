package Problem_2;

import java.awt.*;

public class Robot {
    Point point = new Point();
    String presentLocation = "";
    String[] direction = {"N","E","S","W"};
    int t = 0 , x = 0 , y = 0;
    public void turnLeft()
    {
        if(t-1<0)
        {
            t =4;
        }
        presentLocation = direction[(t-1)%4];
        t = (t-1)%4;

    }
    public void turnRight()
    {
        presentLocation = direction[(t+1)%4];
        t = (t+1)%4;
    }
    public void move()
    {
        if(presentLocation.equals("E"))
        {
            x++;
        }
        else if(presentLocation.equals("W"))
        {
            x--;
        }
        else if(presentLocation.equals("N"))
        {
            y++;
        }
        else {
            y--;
        }
        point.setLocation(x,y);
    }
    public Point getPoint()
    {
        return point;
    }
    public String getPresentLocation()
    {
        return presentLocation;
    }
}
