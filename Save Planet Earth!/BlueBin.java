import processing.core.PApplet;
import java.util.Scanner;
public class BlueBin
{
    public PApplet app;
    public float x;
    public float y;
    public float w;
    public float h;
    

    public BlueBin(PApplet applet, float xx, float yy, float ww, float hh)
    {
        app = applet;
        x = xx;
        y = yy;
        w = ww;
        h = hh;

    }
    public void draw()
    {
        app.fill(0, 196, 255);
        app.rect(x, y, w, h);

    }
}