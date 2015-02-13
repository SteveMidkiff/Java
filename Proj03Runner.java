class Proj03Runner{
// instantiate the picture object
private Picture myPic = new Picture("Proj03.jpg");

public Proj03Runner()	// constructor
{
	System.out.println("Steve Midkiff");
}	// end constructor

	// Accessor Method
public Picture getPicture()
{
	return myPic;
}	// end accessor method

public void run()
{
	myPic.addMessage("Steve Midkiff",10,20);
	

	Pixel myPixelArray[] = myPic.getPixels();

	// declare variables
	Pixel pixel = null;
	int green = 0;
	int blue = 0;
	int width = myPic.getWidth();
	double greenScale = 0;
	double blueScale = 0;

	for(int cnt = 0;cnt < myPixelArray.length;cnt++)
	{
		pixel = myPixelArray[cnt];
		green = pixel.getGreen();
		blue = pixel.getBlue();

		int col = cnt%width;

		// compute the colum number and scale factor
		greenScale = (double)(col)/width;
		blueScale = (double)(width - col)/width;

		// apply the scale factors
		pixel.setGreen((int)(green * greenScale));
		pixel.setBlue((int)(blue * blueScale));	

	}	// end for loop

	myPic.explore();

}	// end run method



}	// end Proj03Runner class
