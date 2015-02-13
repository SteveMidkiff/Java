import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Proj05Runner {
    
    GUI gui = new GUI();    
    
}

class MyFrame extends JPanel{
  int clickX;
  int clickY;
  
public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString(
    "" + clickX + ", " + clickY, clickX, clickY);
  }
}

class GUI {
  public GUI(){
    JFrame theFrame = new JFrame();
    theFrame.setSize(200,200);
    theFrame.setTitle("Steve Midkiff");
    JButton quitButton = new JButton("Quit");
    theFrame.getContentPane().add(quitButton,"North");
    MyFrame displayWindow = new MyFrame();
    theFrame.getContentPane().add(displayWindow,"Center");
    
    theFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    
    theFrame.setVisible(true);
    
    
    
    displayWindow.addMouseListener(new MouseProc(displayWindow));
    
    quitButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          System.exit(0);
        }//end action performed
      }//end newActionListener
    );//end addActionListener
  
    
          
  }//end constructor
}

class MouseProc extends MouseAdapter{
  MyFrame refToWin; 

  MouseProc(MyFrame inWin){//constructor
    refToWin = inWin;
  }//end constructor

  public void mousePressed(MouseEvent e){

    
    
    refToWin.clickX = e.getX();
    refToWin.clickY = e.getY();
    
    refToWin.revalidate();
    refToWin.repaint();
  }//end mousePressed()
}

class WProc1 extends WindowAdapter{
  public void windowClosing(WindowEvent e){
    System.exit(0);
  }//end windowClosing()
}
