import java.awt.Color;

class Proj01Runner{
  //Instantiate the World and Turtle objects.
  private World mars = new World(300,274);
  private Turtle joe = new Turtle(mars);
  private Turtle sue = new Turtle(mars);

  public Proj01Runner(){//constructor
    System.out.println("Steve Midkiff.");
  }//end constructor
  //----------------------------------------------------//

  //Accessor methods
  public Turtle getJoe(){return joe;}
  public Turtle getSue(){return sue;}
  public World getMars(){return mars;}
  //----------------------------------------------------//

  //This method is where the action is.
  public void run(){
    //Replace the default all-white picture with another
    // picture.
    mars.setPicture(new Picture("Proj01.jpg"));
    mars.getPicture().addMessage(
                         "Steve Midkiff",10,20);

    //Manipulate the turtle named joe.
    joe.setName("joe");
    joe.setBodyColor(Color.YELLOW);
    joe.setShellColor(Color.RED);
    joe.setPenColor(Color.YELLOW);
    joe.setPenWidth(3);
    joe.forward();
    joe.turn(-135);
    joe.setPenColor(Color.RED);
    joe.forward(150);

    //Manipulate the turtle named sue
    sue.setName("sue");
    sue.setPenWidth(2);
    sue.setPenColor(Color.BLUE);
    sue.moveTo(183,170);
    sue.setPenDown(false);
    sue.moveTo(216,203);
    sue.setPenDown(true);
    sue.moveTo(250,237);
  }//end run method
}//end class Proj01Runner

