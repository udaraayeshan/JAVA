
//5.1 Data Types

/* int myNum = 5;               // Integer (whole number)
   float myFloatNum = 5.99f;    // Floating point number
   char myLetter = 'D';         // Character
   boolean myBool = true;       // Boolean
   String myText = "Hello";     // String*/


  // Data types are divided into two groups:

//Primitive data types - includes byte, short, int, long, float, double, boolean and char

//Non-primitive data types - such as String, Arrays and Classes 

 //5.2 Java Numbers

 /*
  * Primitive number types are divided into two groups:

Integer types -stores whole numbers, positive or negative (such as 123 or -456), 
without decimals. Valid types are byte, short, 
int and long. Which type you should use, depends on the numeric value.

Floating point types- represents numbers with a fractional part, 
containing one or more decimals.There are two types: float and double.
  */



//   Integer Types

public class Main5 {
    public static void main(String[] args) {
      byte myNum = 100;
      System.out.println(myNum);  

      short myNum1 = 5000;
      System.out.println(myNum1);

      int myNum2 = 100000;
      System.out.println(myNum2);

      long myNum3 = 15000000000L;
      System.out.println(myNum3);

//  Floating Point Types
     float myNum4 = 5.75f;
     System.out.println(myNum4);

     double myNum5 = 19.99d;
     System.out.println(myNum5);

     


    //  Use float or double?
// The precision of a floating point value indicates how many digits the value 
// can have after the decimal point. The precision of float is only six or seven 
// decimal digits, while double variables have a precision of about 15 digits. 
// Therefore it is safer to use double for most calculations.



   //5.3 Booleans

   boolean isJavaFun = true;
   boolean isFishTasty = false;
   System.out.println(isJavaFun);     // Outputs true
   System.out.println(isFishTasty);   // Outputs false

   //5.4 Java Characters
   char myGrade = 'B';
   System.out.println(myGrade);

   char myVar1 = 66, myVar2 = 66, myVar3 = 67;
   System.out.println(myVar1);
   System.out.println(myVar2);
   System.out.println(myVar3);


    }
  }