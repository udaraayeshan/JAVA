//Java Class Methods

/*You learned from the Java Methods chapter that methods are declared within a class, and that they are used to perform certain actions:

Example
Create a method named myMethod() in Main:*/


/*public class Main25 {
    static void myMethod() {
        System.out.println("Hello World!");    //Methods eka
    }
      

      [myMethod() prints a text (the action), when it is called. To call a method, 
      write the method's name followed by two parentheses () and a semicolon;]

      public static void main(String[] args) {   //Main methods eka
        myMethod();
      }
    
}*/

/*Static vs. Public
You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, 
which means that it can be accessed without creating an object of the class, unlike public, 
which can only be accessed by objects: */

public class Main25 {
    // Static method
    static void myStaticMethod() {
      System.out.println("Static methods can be called without creating objects");
    }
  
    // Public method
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
    }
  
    // Main method
    public static void main(String[] args) {
      myStaticMethod(); // Call the static method
      // myPublicMethod(); This would compile an error
  
      Main25 myObj = new Main25(); // Create an object of Main
      myObj.myPublicMethod(); // Call the public method on the object
    }
  }

    //[Access Methods With an Object]

  /*Example
Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, 
and run the program:

// Create a Main class
public class Main {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200 */


//[Using Multiple Classes]

/*Like we specified in the Classes chapter, it is a good practice to create an object of a class and access it in another class.

Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory:

Main.java
Second.java
Main.java
public class Main {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}
Second.java
class Second {
  public static void main(String[] args) {
    Main myCar = new Main();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}
*/