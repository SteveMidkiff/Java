import java.util.*;
import java.io.Serializable;

class Proj10Runner{

	Collection <String> ref = new ArrayList<String>();


	public Collection <String> getCollection(){

		System.out.println("Steve Midkiff");		
		return ref;


	}	// end getCollection method

	public void sortReverse(Collection<String> collection){

		Collections.sort((List)collection, new Proj10Comparator());


	}	// emd sortReverse method

}	// end Proj10Runner class



class Proj10Comparator
	implements Comparator,Serializable{
	
	public int compare(Object o1, Object o2){
		if(!(o1 instanceof String))
			throw new ClassCastException();
		if(!(o2 instanceof String))
			throw new ClassCastException();
		
		int result = ((String)o1).toUpperCase().
			compareTo(((String)o2).toUpperCase());

		return result;

	}	// end compare method


	public boolean equals(Object o){
		if(!(o instanceof Proj10Comparator))
			return false;
		else return true;
	}	// end overridden equals 

}	// end Comparator class