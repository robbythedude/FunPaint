/**
 * @author Robert Steiner
 * SUBCLASS OF SHAPE
 */

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;


public class FreeHand extends Shape {
    
    ArrayList<Point> points = new ArrayList<Point>();  //Holds a list of points to be drawn
    
    public void drawShape(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        setStroke(g2d);  //Calls method to set up the stroke
        g2d.setColor(shapeColor);  //Setting color for the shape
        
        Point np = new Point(newx, newy);  //Creating new points based on where the mouse is dragged
        points.add(np);  //Adds the point to the list
        
        //Connects every point, except the begin and end
        for(int i = 0; i < points.size()-2; i++)
        {
            Point p1 = points.get(i);
            Point p2 = points.get(i+1);
            g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
        
        g2d.setStroke(new BasicStroke());  //Returns to default
        
    }

}
