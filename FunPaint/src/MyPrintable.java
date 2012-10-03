/**
 * @author Robert Steiner
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class MyPrintable implements Printable {

    Image im;
    
    public MyPrintable(Image im)
    {
        this.im = im;
    }
    
    
    @Override
    public int print(Graphics grphcs, PageFormat pf, int i) throws PrinterException {
        grphcs.drawImage(im,0,0,null);
        
        return Printable.PAGE_EXISTS;
    }
    
}
