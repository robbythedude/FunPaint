/**
 * @author Robert Steiner
 */

import java.awt.Graphics;
import javax.swing.JButton;

/*Custome made oval button*/
public class OvalButton extends JButton {
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawOval(3,3,this.getWidth()-6,this.getHeight()-6);
    }
}
