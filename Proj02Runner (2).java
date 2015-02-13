import java.util.*;

public class Proj02Runner<T1, T2>{
    private T1 t1;
    private T2 t2;
    
    public Proj02Runner(T1 t1, T2 t2){
        this.t1 = t1;
        this.t2 = t2;
        System.out.println("Steve Midkiff");
    } // end constructor
    
    public T1 get1(){
        return t1;
    } // end get1
    
    public T2 get2(){
        return t2;
    } // end get2
    
} // end Proj2Runner