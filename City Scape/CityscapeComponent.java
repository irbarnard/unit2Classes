import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @irbarnard
 * @version october
 */
public class CityscapeComponent extends JComponent
{
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;
        
        ABlock aBlock = new ABlock(0,0);
        BBlock bBlock = new BBlock(0,0);
        CBlock cBlock = new CBlock(0,0);
        
        Street street = new Street(0, 500, 900, 100);
        Street stripe1 = new Street(0, 550, 100, 50);
        aBlock.draw(g2);
        bBlock.draw(g2);
        cBlock.draw(g2);
        street.draw(g3);
        stripe1.draw(g3);
        
    }



}
