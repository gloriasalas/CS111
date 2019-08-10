public class BuyingTomatoes{
  public static void main (String[] args){
      System.out.println("Enter cost per pound: ");
      double costPound = IO.readDouble();
      System.out.println("Enter number of pounds: ");
      double numPounds = IO.readDouble();
      boolean badInput = false;
      if(costPound < 0){
        IO.reportBadInput();
        badInput = true;
      }
      if(numPounds < 0){
        IO.reportBadInput();
        badInput = true;
      }
      if(badInput == false){
        IO.outputDoubleAnswer(costPound * numPounds);
      }
  }
}

