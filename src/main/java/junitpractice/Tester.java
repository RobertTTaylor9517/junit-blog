package junitpractice;

public class Tester {
	public int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public String reverse(String input) {
		StringBuilder newInputBuilder = new StringBuilder();
		
		newInputBuilder.append(input);
		
		newInputBuilder = newInputBuilder.reverse();
		
		return newInputBuilder.toString();
	}
	
	public boolean equalsTwo(int num) {
		if(num == 2) {
			return true;
		}
		
		return false;
	}
	
	public int [] sortArray(int[] numArray) {
//		int [] sortedArray = numArray;
		
		int min = 0;
		int hold;
		
		for(int i=0; i < numArray.length; i++) {
			
			if(numArray[i] > min) {
				min = numArray[i];
			}
			
			for(int j=i+1; j < numArray.length; j++) {
				if(numArray[j] < min) {
					hold = numArray[j];
					numArray[i] = hold;
					numArray[j] = min;
					
					min = numArray[j];
				}
			}
		}
		
		return numArray;
	}
}
