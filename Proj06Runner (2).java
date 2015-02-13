/*File Proj05Runner.java Copyright 2002 R.G.Baldwin
**********************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Proj06Runner extends Frame{
  
  int xCoor;
  int yCoor;
  
  public Proj06Runner(){//constructor
    setSize(300,200);
    setTitle("Steve Midkiff");
    

    
  addMouseMotionListener(new MouseMotionAdapter()
    {
      public void mouseMoved(MouseEvent e){
        xCoor = e.getX();
        yCoor = e.getY();

        repaint();
      }
      
      public void mouseDragged(MouseEvent e){
        setForeground(Color.RED);
        xCoor = e.getX();
        yCoor = e.getY();
        
        repaint();        
      }
    }
  );
  
  addWindowListener(new WindowAdapter()
    {//begin class definition
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }//end windowClosing
    }//end class definition
  );//end addWindowListener

    setVisible(true);


  }//end constructor

  public void paint(Graphics g){
    g.drawString("" + xCoor + ", " + yCoor, xCoor, yCoor);
  }
  
}//end class