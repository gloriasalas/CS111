public class PayFee{
	public static void main (String [] args){

		double paymentAmount = 0;
		double feeCharge = 0;

		System.out.println("Input your payment amount");
		paymentAmount = IO.readDouble();


		if(paymentAmount <= 500) {
			feeCharge = 10;
		} 
		if (paymentAmount > 500 && paymentAmount < 5000) {
			feeCharge = (paymentAmount * 0.01);
			if (feeCharge < 20) {
				feeCharge = 20; //if the charge is less than $20
			}
		}
		if (paymentAmount >= 5000 && paymentAmount < 10000) {
			feeCharge = (paymentAmount * 0.02); 
			if (feeCharge < 120) {
				feeCharge = 120; //if the charge is less than $120
			}
		}
		if (paymentAmount >= 10000 && paymentAmount <= 15000) {
			paymentAmount = paymentAmount - 10000;
			feeCharge = (10000 * .02) + (paymentAmount * .03); 
		}
		if (paymentAmount > 15000) {
			paymentAmount= paymentAmount - 15000;
			feeCharge = (10000 * 0.02) + (5000 * 0.03) + (paymentAmount * 0.04);
		}
		IO.outputDoubleAnswer(feeCharge);
	}
}