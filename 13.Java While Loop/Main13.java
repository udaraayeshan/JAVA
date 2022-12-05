/*Java While Loop
Loops
Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.

Java While Loop
The while loop loops through a block of code as long as a specified condition is true:


while (condition) {
  // code block to be executed
}

The Do/While Loop
The do/while loop is a variant of the while loop. This loop will execute the code block once,
before checking if the condition is true, then it will repeat the loop as long as the condition is true.

do {
  // code block to be executed
}
while (condition);

 */


       // While Loop
public class Main13 {
    public static void main(String[] args) {
      int i = 0;
      while (i < 5) {
        System.out.println(i);
        i++;
      }


      //The Do/While Loop
      int i1 = 1;
      do {
        System.out.println(i1);
        i1++;
      }
       while (i1 < 5);  
    }
  }

 
  