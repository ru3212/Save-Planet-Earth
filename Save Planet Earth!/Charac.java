import processing.core.PApplet;
public class Charac 
{
    private PApplet app;
    private float x;
    private float y; 

    public Charac(PApplet applet)
    {
        app = applet;
    }

    public void setCoord(float xx, float yy)
    {
        x = xx;
        y = yy;

    }

    public float isX()
    {
        return x;
    }

    public float isY()
    {
        return y;
    }

    public void draw()
    {

        app.fill(255, 154, 0);
        app.rect(x, y, 25, 25);

    }

    public void checkWall(Walls[] w)
    {
        float isX = x;
        float isY = y;

        boolean collide = false;
        
        if (app.keyPressed)
        {

            if (app.key == 'h')
            {
                isX -= 5;

            }

            else if (app.key == 'u')
            {
                isY -= 5;

            }
            else if (app.key == 'k')
            {
                isX += 5;
            }

            else if (app.key == 'n')
            {
                isY += 5;
            }

        }
        for (int i = 0; i < w.length; i++)
        {
            if (((isX >= w[i].x) && (isX <= (w[i].x + w[i].w)) && ((isY >= w[i].y) && (isY <= w[i].y + w[i].h))) || (((isX + 25) >= w[i].x) && ((isX + 25) <= (w[i].x + w[i].w) && ((isY >= w[i].y) && (isY <= w[i].y + w[i].h)))) || ((isX >= w[i].x) && (isX <= (w[i].x + w[i].w)) && (((isY + 25) >= w[i].y) && ((isY + 25) <= w[i].y + w[i].h))) || (((isX + 25) >= w[i].x) && ((isX + 25) <= (w[i].x + w[i].w)) && (((isY + 25) >= w[i].y) && ((isY + 25) <= w[i].y + w[i].h)))) 
            {
                collide = true;
            }
            else if (((isX + 25) > 1000 || isX < 0))
            {
                collide = true;
            }
            else if (((isY + 25) > app.height || isY < 0))
            {
                collide = true;
            }
        }

        
        if (!collide)
        {
            x = isX;
            y = isY;
        }

        
    }

    public boolean checkBin(String item)
    {
        float isX = x;
        float isY = y;
        boolean getBin = false;
        if (item.equals("sandwich"))
        {
            if ((isX >= 900) && (isX <= (900 + 50)) && ((isY >= 350) && (isY <= 350 + 75)) || (((isX + 25) >= 900) && ((isX + 25) <= (900 + 50) && ((isY >= 350) && (isY <= 350 + 75)))) || ((isX >= 900) && (isX <= (900 + 50)) && (((isY + 25) >= 350) && ((isY + 25) <= 350 + 75))) || (((isX + 25) >= 900) && ((isX + 25) <= (900 + 50)) && (((isY + 25) >= 350) && ((isY + 25) <= 350 + 75)))) 
            {
                getBin = true;
                
                return getBin;
            }
        }
        else if (item.equals("wrappers"))
        {
            if ((isX >= 900) && (isX <= (900 + 50)) && ((isY >= 600) && (isY <= 600 + 75)) || (((isX + 25) >= 900) && ((isX + 25) <= (900 + 50) && ((isY >= 600) && (isY <= 600 + 75)))) || ((isX >= 900) && (isX <= (900 + 50)) && (((isY + 25) >= 600) && ((isY + 25) <= 600 + 75))) || (((isX + 25) >= 900) && ((isX + 25) <= (900 + 50)) && (((isY + 25) >= 600) && ((isY + 25) <= 600 + 75)))) 
            {
                getBin = true;
                return getBin;
            }
        }
        else
        {
            if ((((isX >= 900) && (isX <= (900 + 50)) && ((isY >= 100) && (isY <= 100 + 75))) || (((isX + 25) >= 900) && ((isX + 25) <= (900 + 50) && ((isY >= 100) && (isY <= 100 + 75)))) || ((isX >= 900) && (isX <= (900 + 50)) && (((isY + 25) >= 100) && ((isY + 25) <= 100 + 75))) || (((isX + 25) >= 900) && ((isX + 25) <= (900 + 50)) && (((isY + 25) >= 100) && ((isY + 25) <= 100 + 75)))))
            {
                getBin = true;
                return getBin;
            }
        }

        
        return getBin;
    }

    
}
