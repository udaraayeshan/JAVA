//11.1 IF ..Else

/* Java Conditions and If Statements
You already know that Java supports the usual logical conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed


[The if Statement]
Use the if statement to specify a block of Java code to be executed if a condition is true.

if (condition) {
  // block of code to be executed if the condition is true
}

[The else Statement]
Use the else statement to specify a block of code to be executed if the condition is false.

if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}

[The else if Statement]

Use the else if statement to specify a new condition if the first condition is false.
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}

Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

*/

public class Main11 {
    public static void main(String[] args) {

      if (20 > 18) {
        System.out.println("20 is greater than 18"); // obviously
      }  

      int x = 20;
      int y = 18;
      if (x > y) {
      System.out.println("x is greater than y");
      }

      int time = 20;
      if (time < 18) {
        System.out.println("Good day.");
      } else {
         System.out.println("Good evening.");
      }
      // Outputs "Good evening."

      int time12 = 22;
      if (time < 10) {
        System.out.println("Good morning.");
    } else if (time12 < 18) {
        System.out.println("Good day.");
    } else {
        System.out.println("Good evening.");
     }
     // Outputs "Good evening."


    //11.2 Java Short Hand If...Else (Ternary Operator)
    //variable = (condition) ? expressionTrue :  expressionFalse;
    int time1 = 20;
    String result = (time1 < 18) ? "Good day." : "Good evening.";
    System.out.println(result);


    }
  }

