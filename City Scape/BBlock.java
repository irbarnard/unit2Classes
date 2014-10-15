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
public class BBlock
{
    /** points of block letter */
    private int point1; //starting point of segment
    private int point2; //ending point of segment
    
    /**
     * points of line constructed
     */    
    public BBlock(int p1, int p2)
    {
        point1 = p1;
        point2 = p2;
    }
    
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLACK);
        
        Point2D.Double bA = new Point2D.Double(200,200);
        Point2D.Double bB = new Point2D.Double(200,400);
        Point2D.Double bC = new Point2D.Double(20,310);
        Point2D.Double bD = new Point2D.Double(20,225);
        Point2D.Double bE = new Point2D.Double(100,270);
        Point2D.Double bF = new Point2D.Double(100,230);
        Point2D.Double bG = new Point2D.Double(20,190);
        Point2D.Double bH = new Point2D.Double(20,110);
        Point2D.Double bI = new Point2D.Double(200,280);
        Point2D.Double bJ = new Point2D.Double(175,265);
        Point2D.Double bK = new Point2D.Double(145,245);
        Point2D.Double bL = new Point2D.Double(145,285);
        Point2D.Double bM = new Point2D.Double(200,320);
        Point2D.Double bN = new Point2D.Double(50,205);
        
        Line2D.Double lineA = new Line2D.Double(bA, bB);
        Line2D.Double lineB = new Line2D.Double(bB, bC);
        Line2D.Double lineC = new Line2D.Double(bC, bD);
        Line2D.Double lineD = new Line2D.Double(bD, bE);
        Line2D.Double lineE = new Line2D.Double(bE, bF);
        Line2D.Double lineF = new Line2D.Double(bF, bG);
        Line2D.Double lineG = new Line2D.Double(bG, bH);
        Line2D.Double lineH = new Line2D.Double(bH, bA);
        Line2D.Double lineI = new Line2D.Double(bI, bK);
        Line2D.Double lineJ = new Line2D.Double(bK, bL);
        Line2D.Double lineK = new Line2D.Double(bL, bJ);
        Line2D.Double lineL = new Line2D.Double(bL, bM);
        Line2D.Double lineM = new Line2D.Double(bD, bN);
        
        
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
        g2.draw(lineL);
        g2.draw(lineM);
        //g2.fill(leftmost);
        
    }
}
