import java.awt.*;
import javax.swing.JFrame;

public class Proj03Runner<T extends Frame>{
    private T param;
    
    public Proj03Runner(T param){
    System.out.println("Steve Midkiff");
    this.param = param;
    } // end constructor
    
    public void runIt(){
        System.out.println(param.getClass());
    } // end runIt
} // end Proj03Runner