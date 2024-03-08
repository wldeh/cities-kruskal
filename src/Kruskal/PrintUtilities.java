package Kruskal; 
import java.awt.*;
import javax.swing.*;
import java.awt.print.*;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * File    
 * Description  A simple utility class that lets you very simply print an
 *              an arbitrary component. Just pass the component to the
 *              PrintUtilities.printComponent. The component you want to print
 *              doesn't need a print method and doesn't have to implement any 
 *              interface or do anything special at all.
 *              If you are going to be printing many times, it is marginally 
 *              more efficient to first do the following:
 *              PrintUtilities printHelper = new PrintUtilities(theComponent);
 *              then later do printHelper.print(). But this is a very tiny
 *              difference, so in most cases just do the simpler
 *              PrintUtilities.printComponent(componentToBePrinted).
 *              May be freely used or adapted.
 * @author      11/28 <i>wldeh</i>, http://www.apl.jhu.edu/~hall/java/
 *</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/  
public class PrintUtilities implements Printable
{
    private final double SCALE_FACTOR = 1.0;
    private Component componentToBePrinted;
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  PrintUtilities()
     * Description  Sets componentToBePrinted to provided parameter.
     * @param       componentToBePrinted Component
     * @author      <i>wldeh</i>
     * Date         11/28/2023
     * History Log   
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/  
    public PrintUtilities(Component componentToBePrinted)
    {
        this.componentToBePrinted = componentToBePrinted;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  printComponent()
     * Description  Creates an unnamed instance of the PrintUtilities an calls
     *              its print method.
     * @param       c Component
     * @author      <i>wldeh</i>
     * Date         11/28/2023
     * History Log    
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public static void printComponent(Component c)
    {
        new PrintUtilities(c).print();
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  print()
     * Description  Creates an instance of the PrinterJob an calls its 
     *              setPrintable and print methods.
     * @author      <i>wldeh</i>
     * Date         11/28/2023
     * History Log   
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public void print() 
    {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        printJob.setPrintable(this);
        if (printJob.printDialog())
            try 
            {
                printJob.print();
            } 
            catch(PrinterException pe) 
            {
                System.out.println("Error printing: " + pe);
            }
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  print()
     * Description  Creates an instance of the PrinterJob an calls its 
     *              setPrintable and print methods.
     * @param       g Graphics
     * @param       pageFormat PageFormat
     * @param       pageIndex int
     * @author      <i>wldeh</i>
     * Date         11/28/2023
     * History Log   
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public int print(Graphics g, PageFormat pageFormat, int pageIndex)
    {
        if (pageIndex > 0) 
        {
            return(NO_SUCH_PAGE);
        } else 
        {
            Graphics2D g2d = (Graphics2D)g;
            g2d.translate(pageFormat.getImageableX(), 
                    pageFormat.getImageableY());
            g2d.scale(SCALE_FACTOR,SCALE_FACTOR); 
            disableDoubleBuffering(componentToBePrinted);
            componentToBePrinted.paint(g2d);
            enableDoubleBuffering(componentToBePrinted);
            return(PAGE_EXISTS);
        }
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       disableDoubleBuffering()
     * Description  The speed and quality of printing suffers dramatically if
     *              any of the containers have double buffering turned on. So 
     *              this turns if off globally.
     * @see         enableDoubleBuffering
     * @param       c Component
     * @author      <i>wldeh</i>
     * Date         11/28/2023
     * History Log   
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public static void disableDoubleBuffering(Component c) 
    {
        RepaintManager currentManager = RepaintManager.currentManager(c);
        currentManager.setDoubleBufferingEnabled(false);
    }

    /** Re-enables double buffering globally.
       * @param c  Component*/
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       enableDoubleBuffering 
     * Description  Re-enables double buffering globally.         
     * @param       c Component
     * @author      <i>wldeh</i>
     * Date         11/28/2023
     * History Log     
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public static void enableDoubleBuffering(Component c) 
    {
        RepaintManager currentManager = RepaintManager.currentManager(c);
        currentManager.setDoubleBufferingEnabled(true);
    }
}