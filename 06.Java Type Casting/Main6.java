

/*Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte */

public class Main6 {
 public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    //Widening Casting
    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    
    //Narrowing Casting
    double myDouble1 = 9.78d;
    int myInt1 = (int) myDouble1; // Manual casting: double to int
  
    System.out.println(myDouble1);   // Outputs 9.78
    System.out.println(myInt1);      // Outputs 9
    
 }   
}
