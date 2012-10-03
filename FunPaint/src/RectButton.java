/**
 * @author Robert Steiner
 */

import java.awt.Graphics;
import javax.swing.JButton;


/*Custom made rectangle button*/
public class RectButton extends JButton {
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawRect(5,5,this.getWidth()-12,this.getHeight()-12);
    }
}
