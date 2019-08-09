public class Compress {

  public static void main(String[] args) {
    System.out.println("r: " + compress("r"));
    System.out.println("zzzzzzzz: " + compress("zzzzzzzz"));
    System.out.println("ab: " + compress("ab"));
  }

    static String compress (String original) {
	// WRITE YOUR CODE HERE
    	int length = original.length();
    	String blank = "";
    	if (length == 0) {
    		return blank;
    	}
    	char compareAB = original.charAt(0);
    	//Starts at one to compare A and B
    	int count = 1;
    	String compress = "";
    	//Moving down the Line, new A and B will be compared 
    	for(int a = 1; a < length; a++){
    		char character = original.charAt(a);
    		if (character != compareAB) {
    			if (count == 1){
    				compress += compareAB;
    				compareAB = character;
    			}else {
    				compress = compress + count + compareAB;
    				compareAB = character;
    				count = 1;
    			}
    		}else {
    			count ++;
    		}
    	}
    	if (count == 1) {
    		compress = compress + compareAB;
    	}else{
    		compress = compress + count + compareAB;
    	}
    	return compress;
  }
}
//Read the string
//Loop until you reach a different character
//Count the amount of characters in the String
//Output the result with the character