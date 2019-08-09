public class TrainTicket{
	public static void main (String [] args){
		
		double price;
		boolean senior;
		boolean boughtOnTrain;

		System.out.println("Are you a senior?");
		senior = IO.readBoolean();

		System.out.println("Are you buying the ticket onboard the train?");
		boughtOnTrain = IO.readBoolean();

		if (senior == true){
			price = 6.50;
		}else {
			price = 11.50;
		}

		if (boughtOnTrain == true){
			price = (price * 1.10);
		}
		IO.outputDoubleAnswer(price);
	}
}