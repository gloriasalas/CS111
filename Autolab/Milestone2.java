/* Submit this file for Project Part 1 */
public class Milestone2 {
	

    public static void main (String[] args) {

	// Instantiate a Picture object from file mypic.jpg
	Picture p = new Picture("C:\\Users\\Gloria\\Desktop\\CS Project\\library\\bookClasses\\GreenBlueRed.png");
    //switchRedBlue(p);
    //flipHorizontal(p);
    //flipVertical(p);
    //flipDiagonal(p);

	// The object referenced by p will be manipulated by your methods.

	// Example on how to call the countRedPixels method

    //System.out.println(p);
    p.write("C:\\Users\\Gloria\\Desktop\\CS Project\\library\\bookClasses\\GreenBlueRed-modified.png");

	int redPixels = countRedPixels(p);
	System.out.println("The number of red pixels is: " + redPixels);
    }
    
    /*
     * 1) Returns the number of red pixels in picture v
     */

    
    public static int countRedPixels(Picture v) {
	// WRITE YOUR CODE HERE
    	//string, for, for, if , if red pixel increment
    	//calling objects in the method?

        
		int height = v.getHeight();
		int width = v.getWidth();
		
        int redPixelCount = 0;
        int pixelCount = 0;


		for (int row = 0; row < width; row++){
			for (int col = 0; col < height; col++) {
                int pix = v.getBasicPixel(row, col);
                int red = (pix >> 16) & 0xff;
                int blue = pix & 0xff; 
                int green = (pix >> 8) & 0xff;
                    if (red == 255 && green == 0 && blue == 0) {
                        redPixelCount++;
                    }
                    pixelCount++;
            }
		}
		return redPixelCount;
    }
    
    /*
     * 2) Change all the red pixels in an image to blue pixels and vice versa 
     *    Only pure red and pure blue
     */

    
   public static void switchRedBlue(Picture v) {
	// WRITE YOUR CODE HERE
        int height = v.getHeight();
        int width = v.getWidth();

        for (int row = 0; row < width; row++){
            for (int col = 0; col < height; col++) {
                Pixel pix = new Pixel(v, row, col);
                int alpha = pix.getAlpha();
                int red = pix.getRed();
                int green = pix.getGreen();
                int blue = pix.getBlue();

                if (red == 255 && blue == 0 && green == 0) {
                    pix.setAlpha(alpha);
                    pix.setRed(0);
                    pix.setBlue(255);
                    pix.setGreen(0);
                }else if (red == 0 && green == 0 && blue == 255){
                    pix.setAlpha(alpha);
                    pix.setRed(255);
                    pix.setBlue(0);
                    pix.setGreen(0);
                }
            }

        }
    }
    

    /*
     * 3. Take the left half of an image and reflect it over an imaginary 
     *    vertical line going across the middle of the image.
     *    IF pixels exist ON the midline, leave them there without reflecting
     */
    public static void flipHorizontal(Picture v) {
	// WRITE YOUR CODE HERE
        int height = v.getHeight();
        int width = v.getWidth();

        Pixel [][] pixArr = new Pixel[height][width];
        for(int i = 0; i<width/2;i++){
            for(int j = 0; j<height;j++){
                Pixel temp = v.getPixel(i,j);
                Pixel pix=v.getPixel(width-1-i,j);
                pix.setRed(0);
                pix.setGreen(0);
                pix.setBlue(0);
                pix.setBlue(temp.getBlue());
                pix.setRed(temp.getRed());
                pix.setGreen(temp.getGreen());
            }
        }
    }
	 
    /*
     * 4. Take the top half of an image and reflect it over an imaginary horizontal 
     *    line going through the image 
     *    IF pixels exist ON the midline, leave them there without reflecting
     */
    public static void flipVertical(Picture v) {
	// WRITE YOUR CODE HERE
        int height = v.getHeight();
        int width = v.getWidth();

        Pixel [][] pixArr = new Pixel[height][width];
        for(int i = 0; i<width;i++){
            for(int j = 0; j<height/2;j++){
                Pixel temp = v.getPixel(i,j);
                Pixel pix=v.getPixel(i,height-1-j);
                pix.setRed(0);
                pix.setGreen(0);
                pix.setBlue(0);
                pix.setBlue(temp.getBlue());
                pix.setRed(temp.getRed());
                pix.setGreen(temp.getGreen());
            }
        }
    }

    /*
     * 5. Take the upper half of an image and reflect it over an imaginary diagonal 
     *    line going from the upper left corner of the image to the lower right corner. 
     *    Upper right to lower left diagonal line
     *    You may assume SQUARE images (height == width)
     *    IF pixels exist ON the midline, leave them there without reflecting
     */
    public static void flipDiagonal(Picture v) {
     int height = v.getHeight();
        int width = v.getWidth();

        Pixel [][] pixArr = new Pixel[height][width];
        for(int i = 0; i<width;i++){
            for(int j = 0; j<height;j++){
                Pixel temp = v.getPixel(i,j);
                Pixel pix=v.getPixel(width-1-i,height-1-j);
                pix.setRed(0);
                pix.setGreen(0);
                pix.setBlue(0);
                pix.setBlue(temp.getBlue());
                pix.setRed(temp.getRed());
                pix.setGreen(temp.getGreen());
            }
        }
}
}

    