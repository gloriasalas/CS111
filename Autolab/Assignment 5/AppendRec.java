public class AppendRec {

  public static void main (String[] args) {
    System.out.println(appendNTimes("tea", 0));
    System.out.println(appendNTimes("t", 0));
    System.out.println(appendNTimes("tea", 1));
    System.out.println(appendNTimes("tea", 4));
  }

  public static String appendNTimes (String original, int n) {
      // WRITE YOUR CODE HERE
    if (n==0){
      return original;// Method must be recursive!!!
    }
    return original+appendNTimes(original, n-1);
  }
}
//assume that the input number is >= 0.
//try a large enough number to see if it works