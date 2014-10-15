import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 * Creates a Block letter
 * 
 * @author Ian Barnard 
 * @version October 6th
 */
public class CBlock
{
    /** points of block letter */
    private int point1; //starting point of segment
    private int point2; //ending point of segment
    
    /**
     * points of line constructed
     */    
    public CBlock(int p1, int p2)
    {
        point1 = p1;
        point2 = p2;
    }
    
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLACK);
        
        Point2D.Double cA = new Point2D.Double(200,200);
        Point2D.Double cB = new Point2D.Double(20,110);
        Point2D.Double cC = new Point2D.Double(80,80);
        Point2D.Double cD = new Point2D.Double(300,120);
        Point2D.Double cE = new Point2D.Double(120,60);
        Point2D.Double cF = new Point2D.Double(200,20);
        Point2D.Double cG = new Point2D.Double(380,110);
        Point2D.Double cH = new Point2D.Double(320,140);
        Point2D.Double cI = new Point2D.Double(140,120);
        Point2D.Double cJ = new Point2D.Double(280,160);
        Point2D.Double cK = new Point2D.Double(120,88);

        
        Line2D.Double lineA = new Line2D.Double(cA, cB);
        Line2D.Double lineB = new Line2D.Double(cB, cC);
        Line2D.Double lineC = new Line2D.Double(cC, cD);
        Line2D.Double lineD = new Line2D.Double(cD, cE);
        Line2D.Double lineE = new Line2D.Double(cE, cF);
        Line2D.Double lineF = new Line2D.Double(cF, cG);
        Line2D.Double lineG = new Line2D.Double(cG, cH);
        Line2D.Double lineH = new Line2D.Double(cH, cI);
        Line2D.Double lineI = new Line2D.Double(cI, cJ);
        Line2D.Double lineJ = new Line2D.Double(cJ, cA);
        Line2D.Double lineK = new Line2D.Double(cK, cE);

        
        g2.draw(lineA);
        g2.draw(lineB);
        g2.draw(lineC);
        g2.draw(lineD);
        g2.draw(lineE);
        g2.draw(lineF);
        g2.draw(lineG);
        g2.draw(lineH);
        g2.draw(lineI);
        g2.draw(lineJ);
        g2.draw(lineK);

        //g2.fill(leftmost);
        
    }
}
