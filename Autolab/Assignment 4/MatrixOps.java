public class MatrixOps
//MatrixDriver calls the method, so make sure you run that file and not this one on the command line
{
    public static double[][] multiply(double[][] A, double[][] B)
    {
	// WRITE YOUR CODE HERE
    	int rowLengthA = A.length;
    	int colLengthA = A[0].length;
    	int rowLengthB = B.length;
    	int colLengthB = B[0].length;

        if ((colLengthA != rowLengthB))  //check if row amount in A is equal to column amount in B
        {
            return null;
        }

        double productMatrix [][] = new double [rowLengthA][colLengthB];
    		//create a new array that is the product of A and B
    		//for loop to go through A's elements in the rows
    		for (int i = 0; i < rowLengthA; i++ ) {
    			//another for loop to go through B's elements in the columns 
    			for (int j = 0; j < colLengthB;  j++) {
    				//one more for loop to avoid multiplying A's columns and B's rows
    				for (int y = 0; y < colLengthA; y++) {
    				//now multiply the two together
    					productMatrix[i][j] += (A[i][y] * B[y][j]);
    				}

    			}
    		} 
    		return productMatrix;
    	}
    	//row A == col B
    	//col A == row B
    }

//nested loop
//after each multiplication 
//cannot mutiply it has to be null