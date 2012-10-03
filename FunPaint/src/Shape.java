/**
 * @author Robert Steiner
 * Edited: August 8th
 * SUPER CLASS
 */

import java.awt.*;
import java.io.Serializable;

public abstract class Shape implements Serializable {
    
    int oldx, oldy, newx, newy; //Cordinates of shape
    Color shapeColor, gradColor1, gradColor2;  //Color of shape, and gradients
    boolean dot, fill, grad;  //Attributes of shape
    int howBold = 0, alpha = 100;  //Holds how bold the user wants the shape
    String text;  //Contains text for Text shape
    
    /*Method to draw determined shape*/
    public abstract void drawShape(Graphics g);
    
    /*Method to set up the type of stroke*/
    public void setStroke(Graphics2D g2d)
    {
      
        BasicStroke bs;  //The stroke object
        
        if(dot){  //Dotted
            float[] bd = {10,10,10};
            bs = new BasicStroke(howBold, BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL,10,bd,10);
            g2d.setStroke(bs);
        }
        else  //Not Dotted
        {
            bs = new BasicStroke(howBold);
            g2d.setStroke(bs);   
        }
        
       
            //Applying the composite
            AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float)alpha/100);
            g2d.setComposite(ac);

        
    }
    
    
    
    
    
    
}
