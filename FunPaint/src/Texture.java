
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;

/**
 * @author Robert Steiner
 */


public class Texture extends Shape {
    
    public void drawShape(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        
        BufferedImage bi = new BufferedImage(100, 100, BufferedImage.TYPE_4BYTE_ABGR);  //Preparing buffered image
        
        //Drawing onto buffered image.
        Graphics big = bi.createGraphics();
        big.setColor(Color.RED);
        big.fillOval(0, 0, 50, 50);
        big.drawOval(25, 25, 50, 50);
        
        //Setting up new paint
        java.awt.Rectangle r = new java.awt.Rectangle(100, 100);
        TexturePaint tp = new TexturePaint(bi, r);
        g2d.setPaint(tp);
        
        g2d.fillRect(oldx,oldy,Math.abs(newx-oldx),Math.abs(newy-oldy));  //Draws textured rectangle
        
    }

}
