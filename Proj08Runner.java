
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


class Proj08Runner extends JFrame{

  private JPanel mainPanel = new JPanel();
  private JPanel titlePanel = new JPanel();
  private JSlider slider = new JSlider();
  
  public Proj08Runner(){//constructor

    slider.setMajorTickSpacing(10);
    slider.setMinorTickSpacing(5);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    JLabel myLabel = new JLabel("" + slider.getValue());

    mainPanel.setLayout(new BorderLayout());
    titlePanel.add(myLabel);
    mainPanel.add(titlePanel,BorderLayout.NORTH);
    mainPanel.add(slider,BorderLayout.CENTER);

    getContentPane().add(mainPanel);
    
    setSize(300,100);
    setTitle("Steve Midkiff");
    setVisible(true);

    
    slider.addChangeListener(
      new ChangeListener(){
        public void stateChanged(ChangeEvent e){
          myLabel.setText("" + slider.getValue());
        }//end stateChanged
      }//end new ChangeListener
    );//end addChangeListener
    

  
  addWindowListener(new WindowAdapter()
    {//begin class definition
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }//end windowClosing
    }//end class definition
  );//end addWindowListener


  }//end constructor

  
}//end class