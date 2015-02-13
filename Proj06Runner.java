import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Color;

class Proj06Runner extends Proj06{
  public Proj06Runner(){
    System.out.println("Steve Midkiff.");
  }//end constructor
  //----------------------------------------------------//
  public void run(double angle){
    Proj06.pic = flip(Proj06.pic);
    Proj06.pic.addMessage("Steve Midkiff.",10,20);
    Proj06.pic = rotatePicture(Proj06.pic,angle);
  }//end run
  //----------------------------------------------------//

  public void run(int angle){
    Proj06.pic.addMessage("Steve Midkiff.",10,20);
    Proj06.pic = rotatePicture(Proj06.pic,angle);
  }//end run
  //----------------------------------------------------//

private Picture flip(Picture pic){
    int width = pic.getWidth();
    int height = pic.getHeight();

    Picture output = new Picture(width+1,height+1);

    Pixel pixel = null;
    Color color = null;
    for(int col = 0;col < (width-1);col++){
      for(int row = 0;row < (height-1);row++){
        color = pic.getPixel(col,row).getColor();
        pixel = output.getPixel(width-col-1,row);
        pixel.setColor(color);
      }//end inner loop
    }//end outer loop

    return output;
  }//end crop and flip
  //----------------------------------------------------//


private Picture rotatePicture(Picture pic,double angle){

    //Set up the rotation transform
    AffineTransform rotateTransform =
                                    new AffineTransform();
    rotateTransform.rotate(Math.toRadians(angle),
                           pic.getWidth()/2,
                           pic.getHeight()/2);

    //Get the required dimensions of a rectangle that will
    // contain the rotated image.
    Rectangle2D rectangle2D =
           pic.getTransformEnclosingRect(rotateTransform);
    int resultWidth = (int)(rectangle2D.getWidth());
    int resultHeight = (int)(rectangle2D.getHeight());

    //Set up the translation transform that will translate
    // the rotated image to the center of the new Picture
    // object.
    AffineTransform translateTransform =
                                    new AffineTransform();
    translateTransform.translate(
                      (resultWidth - pic.getWidth())/2,
                      (resultHeight - pic.getHeight())/2);

    //Concatenate the two transforms so that the image
    // will first be rotated around its center and then
    // translated to the center of the new Picture object.
    translateTransform.concatenate(rotateTransform);
    //Create a new Picture object to contain the results
    // of the transformation.
    Picture result = new Picture(
                                resultWidth,resultHeight);

    //Get the graphics context of the new Picture object,
    // apply the transform to the incoming picture and
    // draw the transformed picture on the new Picture
    // object.
    Graphics2D g2 = (Graphics2D)result.getGraphics();
    g2.drawImage(pic.getImage(),translateTransform,null);

    return result;
  }//end rotatePicture
  //----------------------------------------------------//

}//end class Proj06Runner