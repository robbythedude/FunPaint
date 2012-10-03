/**
 * @author Robert Steiner
 * SUBCLASS OF SHAPE
 */

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;


public class Text extends Shape {
  
    public void drawShape(Graphics g)
    {
        g.drawString(text, oldx, oldy);  //Takes the string and draws where user clicks
    }

}
