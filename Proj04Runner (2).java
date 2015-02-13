import java.util.ArrayList;
import java.awt.Window;
import java.awt.Frame;
import javax.swing.JFrame;

public class Proj04Runner{
    
    public Proj04Runner(){
    System.out.println("Steve Midkiff");
    } // end constructor
    
    void display(ArrayList<?> list){
        for(Object n : list){
            System.out.println(n.getClass());
        }
        System.out.println("");
    }
}