import processing.core.PApplet;
public class Walls 
{
    public float x;
    public float y;
    public float w;
    public float h;
    public PApplet app;
    
    public Walls(PApplet applet, float xx, float yy, float ww, float hh)
    {
        app = applet;
        x = xx;
        y = yy;
        w = ww;
        h = hh;
    }
   
    
    public void draw()
    {
        
        app.fill(231);
        app.rect(x, y, w, h);
        
    }
}