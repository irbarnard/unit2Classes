import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 * Write a description of class Street here.
 * 
 * @author irbarnard
 * @version october
 */
public class Stripe
{
    // instance variables - replace the example below with your own
    private int xX;
    private int yY;
    private int length;
    private int width;

    /**
     * Constructor for objects of class Street
     * declares top left corner of street
     * declares length and width of street
     */
    public Stripe(int x, int y, int w, int h)
    {
        xX = x;
        yY = y;
        length = w;
        width = h;
    }
    public void draw(Graphics2D g3)
    {
        //Color grey = new Color(137, 130, 130);
        g3.setColor(Color.YELLOW);
        
        Rectangle stripe1 = new Rectangle(0, 500, 100, 25);
        Rectangle stripe2 = new Rectangle(200, 500, 100, 25);
        Rectangle stripe3 = new Rectangle(400, 500, 100, 25);
        Rectangle stripe4 = new Rectangle(600, 500, 100, 25);
        Rectangle stripe5 = new Rectangle(800, 500, 100, 25);
        Rectangle window1 = new Rectangle(475, 250, 50, 75);
        Rectangle window2 = new Rectangle(575, 250, 50, 75);
        Rectangle window3 = new Rectangle(475, 50, 50, 75);
        Rectangle window4 = new Rectangle(575, 50, 50, 75);
        
        
        g3.fill(stripe1);
        g3.fill(stripe2);
        g3.fill(stripe3);
        g3.fill(stripe4);
        g3.fill(stripe5);
        g3.fill(window1);
        g3.fill(window2);
        g3.fill(window3);
        g3.fill(window4);
        
        g3.draw(stripe1);
        g3.draw(stripe2);
        g3.draw(stripe3);
        g3.draw(stripe4);
        g3.draw(stripe5);
        g3.draw(window1);
        g3.draw(window2);
        g3.draw(window3);
        g3.draw(window4);
        
    }

}


