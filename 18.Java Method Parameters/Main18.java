
/*
 Parameters and Arguments
Information can be passed to methods as parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. 
You can add as many parameters as you want, just separate them with a comma.

The following example has a method that takes a String called fname as parameter. 
When the method is called, we pass along a first name, which is used inside the method to print the full name:
 */

// public class Main18 {
//     static void myMethod(String fname) {
//       System.out.println(fname + " Refsnes");
//     }
  
//     public static void main(String[] args) {
//       myMethod("Liam");
//       myMethod("Jenny");
//       myMethod("Anja");
      
//     }
  //}
  // Liam Refsnes
  // Jenny Refsnes
  // Anja Refsnes

  //Multiple Parameters

//   public class Main18 {
//     static void myMethod(String fname, int age) {
//       System.out.println(fname + " is " + age);
//     }
  
//     public static void main(String[] args) {
//       myMethod("Liam", 5);
//       myMethod("Jenny", 8);
//       myMethod("Anja", 31);
//     }
//   }
  
  // Liam is 5
  // Jenny is 8
  // Anja is 31


  //Return Values

  public class Main18 {
    static int myMethod(int x) {
      return 5 + x;
    }
  
    public static void main(String[] args) {
      System.out.println(myMethod(3));
    }
  }
  // Outputs 8 (5 + 3)
