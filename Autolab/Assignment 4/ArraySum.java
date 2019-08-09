//write the arraySum method that computes the sum of the items of an integer array. 
//The method takes as an argument an integer array and returns the sum of the argument array items.
public class ArraySum {
  public static void main(String args[] ) {
      // Test your arraySum method.
      // Use other test cases as well.
      
      int[] inputArray = {1, -24, 9, 345, 176, 78, -7};
      int sum = arraySum(inputArray);
      System.out.println(sum);
  }
    
  public static int arraySum(int[] sumArray) {
      // WRITE YOUR CODE HERE
  	//program takes an array of integers as a parameter

  		int sum = 0; //have it match the data type of the parameter in the method
		for(int i = 0; i < sumArray.length; i++){ //it is sumArray bc it is the name for the 
												//parameter that is accepted in your method
				sum += sumArray[i]; //has to match parameter name
  }
  		return sum; //should be method bc a method is just going to return the value that 
  					//can be displayed in the main method 
}
}	
//method is just a set of instructions of doing something that is applied to something in our main method