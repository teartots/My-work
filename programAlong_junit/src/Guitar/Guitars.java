package Guitar;

import java.util.Objects;

/**
 * 
 * @author zeke
 * defines the type of guitar in the class
 * 
 */
public class Guitars implements Comparable<Guitars>{
public boolean electric; 
private int numberOfStrings;
/**
 * @param electric
 * @param numberOfStrings
 */
public Guitars(boolean electric, int numberOfStrings) {
	this.electric = electric;
	this.numberOfStrings = numberOfStrings;
}


	@Override
public int hashCode() {
	return Objects.hash(electric, numberOfStrings);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Guitars other = (Guitars) obj;
	return electric == other.electric && numberOfStrings == other.numberOfStrings;
}


	/**
      * Returns a string of the following format
      * {electric|acoustic|} guitar with {numberOfString} strings
      */

@Override
public String toString() {
	return  (electric ? "electric" : "acoustic") + "guitar with " + numberOfStrings + " strings";
}


	@Override
	public int compareTo(Guitars other) {
		if(this.electric != other.electric)
			return this.electric ? 1 : -1;
		else
		return this.numberOfStrings - other.numberOfStrings;
	}

}
