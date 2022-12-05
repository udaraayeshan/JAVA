//Java Math
//The Java Math class has many methods that allows you to perform mathematical tasks on numbers.




public class Main9 {
    public static void main(String[] args) {


      //Math.max(x,y)
      System.out.println(Math.max(20, 10));  

      //Math.min(x,y)

      System.out.println(Math.min(20, 10));

      //Math.sqrt(x)
      //The Math.sqrt(x) method returns the square root of x:
      System.out.println(Math.sqrt(100));
      

       //Math.abs(x)
       //The Math.abs(x) method returns the absolute (positive) value of x:
       System.out.println(Math.abs(-4.7));

       //Math.random()

       //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
       
       int randomNum = (int)(Math.random() * 101);  // 0 to 100
       System.out.println(randomNum);
    }
  }