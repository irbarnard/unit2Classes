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
public class Building
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
    public Building(int x, int y, int w, int h)
    {
        xX = x;
        yY = y;
        length = w;
        width = h;
    }
    public void draw(Graphics2D g3)
    {
        //Color grey = new Color(137, 130, 130);
        g3.setColor(Color.gray);
        Rectangle building = new Rectangle(450, 0, 200, 400);
       
        
        
        g3.fill(building);
        g3.draw(building);
        
    }

}
