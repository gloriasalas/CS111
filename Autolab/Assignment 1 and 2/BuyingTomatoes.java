public class BuyingTomatoes{
	public static void main (String [] args){

		double numPounds;
		double cost;
		double totalCost;
	
		System.out.println("Enter number of pounds");
		numPounds = IO.readDouble();
		System.out.println("Enter cost of pound");
		cost = IO.readDouble();
	
		if (numPounds < 0 || cost < 0){
		IO.outputStringAnswer("Error");
		}else {
			totalCost = numPounds * cost;
			IO.outputDoubleAnswer(totalCost);
		}
		
	}
}

