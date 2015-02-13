

class Proj08RunnerA{

	private int data;

	Proj08RunnerA(int inData){

	System.out.println("Proj08");
	System.out.println("Steve");
	System.out.println("Midkiff");
	this.data = inData/3;

	}	// end constructor

	public int getData(){
	return data;
	}	// end getData()

}	// end Proj08RunnerA class


class Proj08RunnerB{

	public int getDataFromObj(Object refToObj){

	
	int a = ((Proj08RunnerA)refToObj).getData();
	return a;

	}	// end getDataFromObj method

}	// end Proj08RunnerB class