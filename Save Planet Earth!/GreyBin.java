import processing.core.PApplet;
public class GreyBin
{ 
    public PApplet app;
    public float x;
    public float y;
    public float w;
    public float h;
    

    public GreyBin(PApplet applet, float xx, float yy, float ww, float hh)
    {
        app = applet;
        x = xx;
        y = yy;
        w = ww;
        h = hh;
            
    }

    public void draw()
    {
        
        app.fill(153);
        app.rect(x, y, w, h);
    }
}