import java.util.ArrayList;
import java.util.Arrays;

public class Array {
	
	/*
			 Exercise 5 (Arrays)
		Create a method findMinAndPositions that finds the min value of a given array of Integers and also prints its positions.
		
		public static void main(String[] args) {
		    int[] array = {1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};
		    findMinAndPositions(array);
		}
		The results should be similar to the following:
		
		    Min is 1 in positions: 0, 2, 10, 13
		Can you use only one for loop for solving the exercise?
	 
	 */
	
	//method with 2 loops
	static public void findMinAndPositions(int[] array) {
		
		//make a list for storing positions in array
		ArrayList<Integer> positionsList = new ArrayList<>();
		
		//make a variable for storing minimum
		int min = array[0];
		
		// 1st loop finds the minimum
		for ( int i = 0 ; i < array.length ; i++) {
			if (array[i] <= min) {
				min = array[i];
			}
		}
		
		//2nd loop finds the positions
		for ( int i = 0 ; i < array.length ; i++) {
			if ( array[i] == min ) {
				positionsList.add(i);
			}
		}
		
		//print the results
		System.out.println(" Minimum is " + min + " in positions: " + positionsList.toString());
	}
	
	//method with 1 loop and sortof
	static public void findMinAndPositionsWithOneLoop(int[] array) {
		
		//make a list for storing positions in array
		ArrayList<Integer> positionsList = new ArrayList<>();
		
		// copy the array to store positions
		int[] arrayStatic = array.clone();
		
		//make a variable for storing minimum and find min without looping
		Arrays.sort( array );
		int min = array[0];
		for ( int i = 0 ; i < array.length ; i++) {
			if ( arrayStatic[i] == min ) {
				positionsList.add(i);
			}
		}
		//print the results
		System.out.println(" Minimum is " + min + " in positions: " + positionsList.toString());	
	}
	
	//method with 1 loop without sortof
	static public void findMinAndPositionsWithOneLoopAndNoSortOf(int[] array) {
		
		//make a list for storing positions in array
		ArrayList<Integer> positionsList = new ArrayList<>();
		
		//make a variable for storing minimum
		int min = array[0];
				
		// loop finds the minimum and stores the position
		for ( int i = 0 ; i < array.length ; i++) {
			if ( array[i] < min ) {
				min = array[i];
				positionsList.clear();
				positionsList.add(i);
			} else if ( array[i] == min ) {
				positionsList.add(i);
			}
		}
		
		//print the results
		System.out.println(" Minimum is " + min + " in positions: " + positionsList.toString());	
	}


	public static void main(String[] args) {
		
		
		int[] array = {1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};
		findMinAndPositions(array);
		findMinAndPositionsWithOneLoopAndNoSortOf(array);
		findMinAndPositionsWithOneLoop(array);
	}
	
	
}
