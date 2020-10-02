import processing.core.PApplet;
import java.util.Scanner;
import processing.core.PApplet;
public class GreenBin
{
    public PApplet app;
    public float x;
    public float y;
    public float w;
    public float h;
    

    public GreenBin(PApplet applet, float xx, float yy, float ww, float hh)
    {
        app = applet;
        x = xx;
        y = yy;
        w = ww;
        h = hh;

    }
    public void draw()
    {

        app.fill(0, 255, 0);
        app.rect(x, y, w, h);

    }
    
}