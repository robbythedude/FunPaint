/*
 * @author Robert Steiner
 * SUBCLASS OF SHAPE
 */

import java.awt.*;

public class Rectangle extends Shape {
    
    public void drawShape(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        setStroke(g2d);  //Calls method to set up the stroke
        g2d.setColor(shapeColor);  //Setting color for the shape
        
        //Prepares Gradient, if gradient
        if(grad)
        {
            GradientPaint gp = new GradientPaint(oldx, oldy,gradColor1, Math.abs(newx-oldx), Math.abs(newy-oldy), gradColor2);  //Preparing gradiant
            g2d.setPaint(gp);
        }
        
        if(fill) g2d.fillRect(oldx,oldy,Math.abs(newx-oldx),Math.abs(newy-oldy));  //Draws filled rectangle
        else g2d.drawRect(oldx,oldy,Math.abs(newx-oldx),Math.abs(newy-oldy)); //Draws Rectangle
        g2d.setStroke(new BasicStroke());  //Returns to default
        
    }
    
    
   
    
}
