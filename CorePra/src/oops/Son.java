package oops;

public class Son implements Father, Mother {
	
	public float calculateSonHeight() {
		
		return (Father.HEIGHT + Mother.HEIGHT)/2;
	}

}
