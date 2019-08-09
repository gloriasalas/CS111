public class TwoSmallest{
	public static void main (String [] args){
		//implement an input counter 
		int counter = 0;

		//ask for terminating value 
		double termValue = IO.readDouble();
		counter++; //need counter to make sure at least two numbers are inputted

		//ask for next value
		double value = IO.readDouble();
		//ask for next values that will be later on resulted as the smallest and secondsmallest which is what we are looking for 
		double smallest;
		double secondSmallest;

		if (value != termValue) {
			smallest = value;
			secondSmallest = value;
			counter++; //valid input
		}
		else {
			do{
				IO.reportBadInput();
				value = IO.readDouble();
			}
		while (value == termValue);
			smallest = value;
			secondSmallest = value;
			counter++;
		}
 		
 		//next input
 		value = IO.readDouble();

 		if (value ==termValue) {
 			do
 			{
 				IO.reportBadInput();
 				value = IO.readDouble();
 			}
 			while (value ==termValue);
 			counter++;
 		}
 		else 
 			counter ++;

 		if (value < smallest) {
 			double temp = smallest;
 			smallest = value;
 			secondSmallest = temp;
 		}
 		else 
 			secondSmallest = value;

 		//loop begins for values to keep being inputed until terminating value is entered

 		if (counter == 3) {
 			value = IO.readDouble();
 			while (value != termValue) {
 				if (value < smallest) {
 					double temp = smallest;
 					smallest = value;
 					secondSmallest = temp;
 				}
 				else {
 					if (value < secondSmallest)
 						secondSmallest = value;
 				}
 				value = IO.readDouble();
 			}
 		}

 		else 
 			System.out.println("Error");

 		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(secondSmallest);

 		// smallest = 5 and secondSmallest = 2
 		// cannot have smallest be greater than secondSmallest 
 		//smallest or secondSmallest cannot be equal to the terminating value
	
		 //display the new value that is inputted 
		//this is for if the newest value inputted happens to be less than the first inputted value
		//it would be the newest smallest value that is stored 

	}

}

		//ask a number, if it equals term then stop, if it doesnt then code logic to determine the smallest and 
		//keep asking for numbers until a term value is entered 
		//do while
		//if statement for if the smallest ends up being greater than the secondSmallest 