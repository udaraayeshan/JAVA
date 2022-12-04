//[4.1Variables]

/*Java Variables
Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false*/

// Declaring (Creating) Variables

public class Main4 {
    public static void main(String[] args) {

      String name = "John";
      System.out.println(name);

      int myNum = 15;
      System.out.println(myNum);

      //You can also declare a variable without assigning the value, and assign the value later

      int myNum1;
      myNum1 = 15;
      System.out.println(myNum1);

      //Change the value of myNum from 15 to 20:

      int myNum2 = 15;
      myNum2 = 20;  // myNum is now 20
      System.out.println(myNum2);
      
    //   Final Variables
    /*final int myNum3 = 15;
    myNum3 = 20; */
    // will generate an error: cannot assign a value to a final variable

    //[4.2 Java Print Variables]
    
    //To combine both text and a variable, use the + character:
    System.out.println("Hello " + name);

    //You can also use the + character to add a variable to another variable:
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    
    //For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):

    int x = 5;
    int y = 6;
    System.out.println(x + y);

    //4.3[Declare Many Variables]
    
    int z = 50;
    System.out.println(x + y + z);

    int q = 5, w = 7, t = 50;
    System.out.println(q + w + t);

    //4.4[Java Identifiers]

    // All Java variables must be identified with unique names.

    // These unique names are called identifiers.

    
    //int minutesPerHour = 60;

    // OK, but not so easy to understand what m actually is
    //int m = 63;

// The general rules for naming variables are:

// Names can contain letters, digits, underscores, and dollar signs
// Names must begin with a letter
// Names should start with a lowercase letter and it cannot contain whitespace
// Names can also begin with $ and _ (but we will not use it in this tutorial)
// Names are case sensitive ("myVar" and "myvar" are different variables)
// Reserved words (like Java keywords, such as int or boolean) cannot be used as names


    }
  }
  