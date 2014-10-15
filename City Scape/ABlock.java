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
public class ABlock
{
    /** points of block letter */
    private int point1; //starting point of segment
    private int point2; //ending point of segment
    
    /**
     * points of line constructed
     */    
    public ABlock(int p1, int p2)
    {
        point1 = p1;
        point2 = p2;
    }
    
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLACK);
        
        Point2D.Double aA = new Point2D.Double(200,200);
        Point2D.Double aB = new Point2D.Double(200,400);
        Point2D.Double aC = new Point2D.Double(260,370);
        Point2D.Double aD = new Point2D.Double(260,290);
        Point2D.Double aE = new Point2D.Double(320,260);
        Point2D.Double aF = new Point2D.Double(320,340);
        Point2D.Double aG = new Point2D.Double(260,320);
        Point2D.Double aH = new Point2D.Double(380,315);
        Point2D.Double aI = new Point2D.Double(380,110);
        Point2D.Double aJ = new Point2D.Double(260,270);
        Point2D.Double aK = new Point2D.Double(260,210);
        Point2D.Double aL = new Point2D.Double(320,180);
        Point2D.Double aM = new Point2D.Double(320,240);
        Point2D.Double aN = new Point2D.Double(260,230);
        
        Line2D.Double lineA = new Line2D.Double(aA, aB);
        Line2D.Double lineB = new Line2D.Double(aB, aC);
        Line2D.Double lineC = new Line2D.Double(aC, aD);
        Line2D.Double lineD = new Line2D.Double(aD, aE);
        Line2D.Double lineE = new Line2D.Double(aE, aF);
        Line2D.Double lineF = new Line2D.Double(aF, aG);
        Line2D.Double lineG = new Line2D.Double(aF, aH);
        Line2D.Double lineH = new Line2D.Double(aH, aI);
        Line2D.Double lineI = new Line2D.Double(aI, aA);
        Line2D.Double lineJ = new Line2D.Double(aJ, aK);
        Line2D.Double lineK = new Line2D.Double(aK, aL);
        Line2D.Double lineL = new Line2D.Double(aL, aM);
        Line2D.Double lineM = new Line2D.Double(aM, aN);
        Line2D.Double lineN = new Line2D.Double(aM, aJ);
        
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
        g2.draw(lineN);
        //g2.fill(leftmost);
        
    }
}
