public class Census{
	public static void main (String [] args){

		int numOfApartments;
		int totalChildren = 0;
		int totalSeniors= 0;
		int totalAdults = 0;

		int numOfChildren = 0;
		int numOfSeniors = 0;
		int numOfAdults = 0;
		int count = 1;

		//read number of apartments
		System.out.println("How many apartments are in the complex?");
		numOfApartments = IO.readInt();

		while (count <= numOfApartments){
			System.out.println("How many children are in apartment " + count);
			numOfChildren = IO.readInt();
			totalChildren = totalChildren + numOfChildren;
			System.out.println("How many seniors are in apartment " + count);
			numOfSeniors = IO.readInt();
			totalSeniors = totalSeniors + numOfSeniors;
			System.out.println("How many adults are in apartment " + count);
			numOfAdults = IO.readInt();
			totalAdults = totalAdults + numOfAdults;

			count = count + 1;    
		}
		IO.outputIntAnswer(totalChildren);
		IO.outputIntAnswer(totalSeniors);
		IO.outputIntAnswer(totalAdults);
		IO.outputDoubleAnswer((double)totalChildren/(numOfApartments));
		IO.outputDoubleAnswer((double)totalSeniors/(numOfApartments));
		IO.outputDoubleAnswer((double)totalAdults/(numOfApartments));
	}
}
