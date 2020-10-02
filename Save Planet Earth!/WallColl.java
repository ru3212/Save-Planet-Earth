import processing.core.PApplet;

public class WallColl extends PApplet
{
    private Charac c;
    private Walls[] wall;
    private float x;
    private float y;
    //private Texts t;
    private static String name;
    private static boolean status;
    private static String[] items;
    private BlueBin blueB;
    private GreenBin greenB;
    private GreyBin greyB;
    public static String itemType;
    private static String colorBin;
    
    public static void main(String[] args)
    {
        PApplet.main(new String[] {"WallColl"});

        
    }


    public void settings()
    {
        size(1500, 700);

    }

    public void setup()
    {

        items = new String[3];
        items[0] = "cardboard";
        items[1] = "sandwich";
        items[2] = "wrappers";
        itemType = items[(int)(Math.random() * 3)];

        
          
        
        c = new Charac(this);
        
        blueB = new BlueBin(this, 900, 100, 50, 75);
        greenB = new GreenBin(this, 900, 350, 50, 75);
        greyB = new GreyBin(this, 900, 600, 50, 75);
        c.setCoord(10, 10);
        wall = new Walls[14];
        wall[0] = new Walls(this, 500, 0, 40, 100);
        wall[1] = new Walls(this, 750, 0, 40, 100);
        
        wall[2] = new Walls(this, 100, 233, 900, 40);
        wall[3] = new Walls(this, 75, 467, 925, 40);
        wall[4] = new Walls(this, 350, 75, 40, 300);
        wall[5] = new Walls(this, 0, 350, 125, 40); 
        wall[6] = new Walls(this, 200, 325, 40, 300);
        wall[7] = new Walls(this, 625,50, 40, 350);
        wall[8] = new Walls(this, 0, 575, 100, 40);
        wall[9] = new Walls(this, 625, 560, 40, 140);
        wall[10] = new Walls(this, 375, 600, 40, 100);
        wall[11] = new Walls(this, 500, 325, 40, 300);
        wall[12] = new Walls(this, 750, 325, 40, 325);
        wall[13] = new Walls(this, 1000, 0, 50, 700);
        x = c.isX();
        y = c.isY();
        
    }

    public void draw()
    {

        background(133, 247, 125);
        noStroke();
        blueB.draw();
        greenB.draw();
        greyB.draw();
        String s = "Welcome to Save Planet Earth!";
        fill(0);
        textSize(26);
        text(s, 1090, 10, 400, 70);
        String directions = "Directions: You will be given an item and have to decide what bin the item goes in. Then you will use the orange square in the top left corner to navigate your way through the maze to the correct bin. The goal of this game is to encourage players to learn which bin each item belongs in, so the game will not end until you place the item in the correct bin.";
        textSize(16);
        fill(0);
         text(directions, 1100, 60, 375, 375);
          String binGuide = "Blue Rectangle = Recycling Bin" + "\n" + " Green Rectangle = Organics Bin" + "\n" + "Grey Bin = Trash Can"; 
          text(binGuide, 1100, 275, 375, 250);
        
         String whatItem = "Your item is: " + itemType;
         text(whatItem, 1100, 375, 300, 100);
        String key = "UP: press 'u' " + "\n" + " DOWN: press 'n' " + "\n" + " LEFT: press 'h' " + "\n" + " RIGHT: press 'k' ";
         text(key, 1100, 425, 200, 175);

        c.draw();
        c.checkWall(wall);
        

        if (c.checkBin(itemType))
        {
            status = true;
            fill(0);
            textSize(19);
            text("Congrats! You won the game by placing " + itemType + " in the correct bin! If you would like to play again, simply run the code. And don't forget to keep the planet clean :)",1075, 540, 400, 150);
            noLoop();
        }
        for (int i = 0; i < wall.length; i++)
        {
            wall[i].draw();
        }
        
    }

    
    
}

