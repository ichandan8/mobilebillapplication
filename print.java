package mobilebillapplication;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class print implements Printable
{
public print()
{
// Create a Printer Job Object
PrinterJob printJob=PrinterJob.getPrinterJob();
//Set the Printer class
printJob.setPrintable(this);
// This method is called on click of Print Button in Print dialog
if(printJob.printDialog()) {
      try {
        printJob.print();
      } catch (Exception PrintException) {
        PrintException.printStackTrace();
      }
    }
}

@Override
public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
	// TODO Auto-generated method stub
	return 0;
}
}