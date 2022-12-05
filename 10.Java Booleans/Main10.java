

/*
 Java Booleans
Very often, in programming, you will need a data type that can only have one of two values, like:

YES / NO
ON / OFF
TRUE / FALSE
For this, Java has a boolean data type, which can store true or false values.

 */


public class Main10 {
    public static void main(String[] args) {


        //Boolean Values
        //A boolean type is declared with the boolean keyword and can only take the values true or false:
      boolean isJavaFun = true;
      boolean isFishTasty = false;    
      System.out.println(isJavaFun);
      System.out.println(isFishTasty);

       /*Boolean Expression
A Boolean expression returns a boolean value: true or false.

This is useful to build logic, and find answers.

For example, you can use a comparison operator,
 such as the greater than (>) operator, 
 to find out if an expression (or a variable) is true or false: */

      int x = 10;
      int y = 9;
      System.out.println(x > y); // returns true, because 10 is higher than 9 

      System.out.println(10 > 9); // returns true, because 10 is higher than 9  

     int x1 = 10;
     System.out.println(x1 == 10); // returns true, because the value of x is equal to 10

     System.out.println(10 == 15); // returns false, because 10 is not equal to 15
     
     //Real Life Example

     int myAge = 25;
     int votingAge = 18;

     if (myAge >= votingAge) {
       System.out.println("Old enough to vote!");
     } else {
       System.out.println("Not old enough to vote.");
     }

    }
  }
  