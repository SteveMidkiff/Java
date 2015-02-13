

class Proj02Runner{
private Picture myPic = new Picture("Proj02.jpg");


public Proj02Runner()	// constructor
	{
	System.out.println("Steve Midkiff");

	}	// end constructor	

// picture accessor method
public Picture getPicture()
	{
	return myPic;
	} // end picture accessor method

public void run()
	{
	myPic.addMessage("Steve Midkiff",10,20);


	// create an array of pixels
	Pixel[] myPixelArray = myPic.getPixels();

	for(Pixel pixel:myPixelArray)
	{
	pixel.setRed(255-pixel.getRed());
	pixel.setGreen(255-pixel.getGreen());
	pixel.setBlue(127);
	}	// end for-each loop	

	myPic.explore();

	}	// end of run method

} // end of Proj02Runner class

