/*File Proj05Runner.java Copyright 2002 R.G.Baldwin
**********************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Proj07Runner extends JFrame{
  
  int xCoor;
  int yCoor;
  
  public Proj07Runner(){//constructor
    setSize(250,100);
    setTitle("Steve Midkiff");
    setLayout(new FlowLayout(FlowLayout.RIGHT,10,15));
    
    JLabel myLabel = new JLabel("Left");
    myLabel.setBackground(Color.yellow);
    myLabel.setForeground(Color.red);
    myLabel.setOpaque(true);
    
    JButton leftB = new JButton("Left");
    JButton rightB = new JButton("Right");
    
    class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent e){
        String name = ((JButton)e.getSource()).getText();
        myLabel.setText(name);
        }
    }
    
    ButtonListener b1 = new ButtonListener();
    
    leftB.addActionListener(b1);
    rightB.addActionListener(b1);
    
    add(leftB);
    add(myLabel);
    add(rightB);
    
  
  addWindowListener(new WindowAdapter()
    {//begin class definition
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }//end windowClosing
    }//end class definition
  );//end addWindowListener

    setVisible(true);


  }//end constructor

  
}//end class