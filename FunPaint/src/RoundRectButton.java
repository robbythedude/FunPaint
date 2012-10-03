/**
 * @author Robert Steiner
 */

import java.awt.Graphics;
import javax.swing.JButton;

/*Custom made rounded rectangle button*/
public class RoundRectButton extends JButton{
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawRoundRect(5,5,this.getWidth()-12,this.getHeight()-12,3,3);
    }
    
}
