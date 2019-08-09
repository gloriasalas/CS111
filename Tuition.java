public class Tuition{
	public static void main (String [] args){
		
		int credits;
		boolean universityEmployee;
		boolean stateEmployee;
		boolean installmentPays;
		double charge;
		double creditsCost;
		
		//read credits
		System.out.println("How many credits is the student taking this semester?");
		credits = IO.readInt();

		//read universityEmployee
		System.out.println("Is the student a university employee?");
		universityEmployee = IO.readBoolean();
		//read stateEmployee
		System.out.println("Is the student a state employee?");
		stateEmployee = IO.readBoolean();
		//read installmentPays
		System.out.println("Are payments to be made in installments?");
		installmentPays = IO.readBoolean();


		if(credits < 0){
			IO.outputStringAnswer("Error");
		} else {
			charge = 5.75;
			creditsCost = (credits * 35);
		if (stateEmployee == true){
			charge = charge + (creditsCost * 0.20);
		} else if (universityEmployee == false){
			charge = charge + creditsCost;
		}
		if (installmentPays == true){
			charge = charge + (charge * 0.02);
		}
		IO.outputDoubleAnswer(charge);
	
		}
	}
}	