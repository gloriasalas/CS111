public class MyPicture {

    /*
     * Fields or instance variables//attributes
     */
    private Picture picture; // basis that provides the extension of class Picture
    private String filename; // the name of the image file
    private int width;       // the image width
    private int length;      // the image length
    private String description; // the image description
    //using these instance variables to test out the methods 
    /* 
     * Constructor. 
     * Takes as a parameter the name of the file to load and a description of the picture.
     * The width and height of an image are available in the Picture class.
     //
     */
    //main method
    //ex: cat image is 500 x 400 height = 500 width = 400 
    //setting everything equal to its correesponding instance variable 
   /*   public static void main (String[] args) {
        MyPicture pic = new MyPicture("C:\\Users\\Gloria\\Desktop\\CS Project\\library\\bookClasses\\pug.png", "pug1"); //doesn't matter what the second string thing is, it can be anything
        System.out.println(pic.toString());


        //Picture p1 = pic.negative ();
        
        //p1.write("C:\\Users\\Gloria\\Desktop\\CS Project\\library\\bookClasses\\pug-modified.png");

        //double p1 = pic.redness();
        //System.out.println(p1);

        //pic.flipHorizontal();
    }*/


    //Constructor declaration of class
    public MyPicture(String filename, String description) {
	// WRITE YOUR CODE HERE

        this. picture = new Picture(filename);
    	this.filename = filename; 
        this.description = description;
        this.width = picture.getWidth();
        this.length = picture.getHeight();

    }

    /*
     * Returns the string representation for a MyPicture object.
     * The string's format should match the following EXACTLY:
     *       <imagename>.<extension> <width> x <length> <description>
     * Replace <xxx> with the respective data about this image
     */
    public String toString() {
	// WRITE YOUR CODE HERE
        //imagename is the full path of our image file
        // "<imagename>.<extension> <width> x <length> <description>

        //refer to SimplePicture class
       // filename = picture.getFilename();
        //String extension = picture.getExtension();
        //return filename+","+extension+ " " + width + " " + "x" + " " + length + " " + description;
        return filename + " " + width + " x " +length+ " "+ description;
    }

    /* 
     * Returns true of the parameter MyPicture object is equal 
     * to the current instance, false otherwise. MyPicture objects 
     * are considered equal if and only if their filenames are the 
     * same AND their descriptions are the same.
     */
    public boolean equals(MyPicture p) {
	// WRITE YOUR CODE HERE
        filename = this.filename;
        description = this.description;
        if (filename.equals(p.filename) && description.equals(p.description) ){
            return true;
        }
        return false;
    }

    /* 
     * Returns a new Picture object representing the 'negative'
     * image of this MyPicture object. The negative of a pixel
     * is defined by taking each pixel's red, blue, and green value and
     * subtracting that value from 255.
     */
    //working with image do not need to make a reference to it 

    public Picture negative () {
	// WRITE YOUR CODE HERE
        int width = picture.getWidth();
        int length = picture.getHeight();
        //traverse = to go through it 
        for(int i = 0; i < width;i++){
            for(int j = 0; j < length;j++){
                //create new pixel object that gets specific pixel
                //specific row and column location changing value
                //the new red pixel value to that pixel value
                Pixel pix = picture.getPixel(i, j);
                //refer to SimplePicture and Pixel
                pix.setRed(255 - pix.getRed());
                pix.setBlue(255 - pix.getBlue());
                pix.setGreen(255 - pix.getGreen());
            }
        }
        return picture;
    }

    /*
     * Returns the redness score of this image. 
     * The redness score is defined by the total number of pixels that have
     * a red value that is greater than both the blue and green
     * pixels divided by the total number of pixels
     */

//you have to go through each pixel, get the red value, the blue value and the green value of the pixel.
//check if the red value is greater than the blue value of the pixel and if the red value is greater than 
//the green value of the pixel. If it is then increment the counter by one (the counter that keeps track 
//of the red pixels whose red value is bigger than both the blue value and the green value). After you 
//have gone through all the pixels, divide the number of red pixels (whose red value is bigger than both 
//its blue value and green value )by the total number of pixels. Display this result as a double. 
    public double redness() {
	// WRITE YOUR CODE HERE
        int redCount = 0;
        int totalPixCount = 0;
        int width = picture.getWidth();
        int length = picture.getHeight();

        for(int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                Pixel pic = picture.getPixel(i,j); 
                int red = pic.getRed();
                int blue = pic.getBlue(); 
                int green = pic.getGreen();
                if (red > green && red > blue) {
                        redCount++;
                }
                    totalPixCount++;
        }
       }
       return (double) redCount/totalPixCount;
       } 
    /* 
     * Convert flipHorizontal from Part 1 to an instance method
     */
    
    public void flipHorizontal () {
	// WRITE YOUR CODE HERE
        //we have to call it
        //last time actually passing through a picture
        //but here there are no parameters 
        int height = picture.getHeight();
        int width = picture.getWidth();

       // Pixel [][] pixArr = new Pixel[height][width];
        for(int i = 0; i<width/2;i++){
            for(int j = 0; j<height;j++){
                Pixel temp = picture.getPixel(i,j);
                Pixel pix=picture.getPixel(width-1-i,j);
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
     * Convert flipVertical from Part 1 to an instance method
    */
    public void flipVertical () {
	// WRITE YOUR CODE HERE

        //calling instance variable
        int height = picture.getHeight();
        int width = picture.getWidth();

        //Pixel [][] pixArr = new Pixel[height][width];
        for(int i = 0; i<width;i++){
            for(int j = 0; j<height/2;j++){
                Pixel temp = picture.getPixel(i,j);
                Pixel pix=picture.getPixel(i,height-1-j);
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
