import java.awt.Color;

class Proj05Runner extends Proj05{

  public Proj05Runner(){//constructor
    System.out.println("Steve Midkiff.");
  }//end constructor
  //----------------------------------------------------//

  public void run(){

    Picture skater = new Picture("Proj05a.bmp");
    skater = crop(skater,6,59,392,293);

    Picture hole = new Picture("Proj05b.bmp");
    hole = crop(hole,6,59,392,293);

    Picture snowScene = new Picture("Proj05c.jpg");
    snowScene = crop(snowScene,6,59,392,293);

    darkenBackground(hole,snowScene);

    tint(skater);

    greenScreenDraw(skater,snowScene,0,0);

    snowScene.addMessage("Steve Midkiff.",10,15);

    snowScene.explore();

  }//end run method
  //----------------------------------------------------//


  private void darkenBackground(
                           Picture pattern,
                           Picture dest){

    Pixel[] patternPixels = pattern.getPixels();
    Pixel[] destPixels = dest.getPixels();
    Color color = null;
    int red = 255;
    int green = 255;
    int blue = 204;

    for(int cnt = 0;cnt < patternPixels.length;cnt++){
      color = patternPixels[cnt].getColor();
      if(color.equals(Color.GREEN)){
        //Darken corresponding pixel in the destination.
        color = destPixels[cnt].getColor();
        destPixels[cnt].setColor(color.darker());
      }else{
        color = destPixels[cnt].getColor();
        destPixels[cnt].setColor(new Color(red,green,blue));
      }//end else
    }//end for loop
  }//end darkenBackground
  //----------------------------------------------------//


 private void tint(Picture pic){
    Pixel[] pixels = pic.getPixels();
    Color color = null;
    int red = 0;
    int green = 0;
    int blue = 0;
    for(int cnt = 0;cnt < pixels.length;cnt++){
      color = pixels[cnt].getColor();

      if(!(color.equals(Color.GREEN))){

        blue = (int)(color.getBlue() * 0.7);
        green = (int)(color.getGreen() * 1);
        red = (int)(color.getRed() * 1);

        //Apply the new color to the pixel.
        pixels[cnt].setColor(new Color(red,green,blue).brighter());
        
      }//end if
    }//end for loop
  }//end tint
  //----------------------------------------------------//


  private void greenScreenDraw(
                           Picture source,
                           Picture dest,
                           //Place the upper-left corner
                           // of the source image at the
                           // following location in the
                           // destination image.
                           int destX,
                           int destY){
    int width = source.getWidth();
    int height = source.getHeight();
    Pixel pixel = null;
    Color color = null;

    for(int row = 0;row < height;row++){
      for(int col = 0;col < width;col++){
        color = source.getPixel(col,row).getColor();
        if(!(color.equals(Color.GREEN))){
          pixel = dest.getPixel(destX + col,destY + row);
          pixel.setColor(color);
        }//end if
      }//end inner loop
    }//end outer loop

  }//end greenScreenDraw
  //----------------------------------------------------//


  private Picture crop(Picture pic,int startCol,
                                   int startRow,
                                   int width,
                                   int height){
    Picture output = new Picture(width,height);

    int colOut = 0;
    int rowOut = 0;
    int col = 0;
    int row = 0;
    Pixel pixel = null;
    Color color = null;
    for(col = startCol;col < startCol+width;col++){
      for(row = startRow;row < startRow+height;row++){
        color = pic.getPixel(col,row).getColor();
        pixel = output.getPixel(colOut,rowOut);
        pixel.setColor(color);
        rowOut++;
      }//end inner loop
      rowOut = 0;
      colOut++;
    }//end outer loop
    return output;
  }//end crop

}//end class Proj05Runner