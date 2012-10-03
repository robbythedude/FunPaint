/**
 * @author Robert Steiner
 * SUBCLASS OF SHAPE
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Line extends Shape {
    
    public void drawShape(Graphics g)
   {
        Graphics2D g2d = (Graphics2D)g;
        setStroke(g2d);  //Calls method to set up the stroke
        
        g2d.setColor(shapeColor);  //Setting color for the shape
        g2d.drawLine(oldx,oldy,newx,newy);  //Draws line
        g2d.setStroke(new BasicStroke());  //Returns to default
        
    }
    
  
    
}
