class Proj04Runner{

public Proj04Runner()	// constructor
{
	System.out.println("Steve Midkiff");
}	// end constructor


public Picture run()
{
	// instantiate the picture object
	Picture myPic = new Picture("Proj04.jpg");

	//Add my name and display the output picture.
	myPic.addMessage("Steve Midkiff",10,20);

	//Call the mirrorUpperQuads method to modify the top
	// half of the picture.
	myPic = mirrorUpperQuads(myPic);

	//Mirror the top half into the bottom half.
	myPic = mirrorHoriz(myPic);
    
	myPic.explore();

	return myPic;

}// end run method


private Picture mirrorUpperQuads(Picture pix){
	Pixel leftPixel = null;
	Pixel rightPixel = null;
    
	int midpoint = pix.getWidth()/2;
	int width = pix.getWidth();

	for(int row = 0;row < pix.getHeight()/2;row++){
		for(int col = 0;col < midpoint;col++){
			leftPixel = pix.getPixel(col,row);
			rightPixel = pix.getPixel(width-1-col,row);
			rightPixel.setColor(leftPixel.getColor());
		}//end inner loop
	}//end outer loop

	return pix;
}//end mirrorUpperQuads


private Picture mirrorHoriz(Picture pix){
	Pixel topPixel = null;
	Pixel bottomPixel = null;
    
	int midpoint = pix.getHeight()/2;
	int height = pix.getHeight();
    
	for(int col = 0;col < pix.getWidth();col++){
		for(int row = 0;row < midpoint;row++){
			topPixel = pix.getPixel(col,row);
			bottomPixel = pix.getPixel(col,height-1-row);
			bottomPixel.setRed(255-topPixel.getRed());
			bottomPixel.setGreen(255-topPixel.getGreen());
			bottomPixel.setBlue(255-topPixel.getBlue());

		}//end inner loop
	}//end outer loop

	return pix;
	}//end mirrorHoriz
//----------------------------------------------------//
  
}//end class Prob01Runner


