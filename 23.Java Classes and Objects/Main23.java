


/*Create a Class
To create a class, use the keyword class:

Main23.java
Create a class named "Main23" with a variable x:

public class Main23 {
  int x = 5;
}


Create an Object
In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

Example
Create an object called "myObj" and print the value of x:




public class Main23 {
  int x = 5;

  public static void main(String[] args) {
    Main23 myObj = new Main23();
    System.out.println(myObj.x);

    //Multiple Objects

    Main23 myObj1 = new Main23();  // Object 1
    Main23 myObj2 = new Main23();  // Object 2

    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}      */

/*Using Multiple Classes

You can also create an object of a class and access it in another class. 
This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

Remember that the name of the java file should match the class name. In this example, 
we have created two files in the same directory/folder:

>Main.java
>Second.java*/

//Main.java

public class Main23 {
  int x = 5;
}

//Second.java

 class Second {
  public static void main(String[] args) {
    Main23 myObj = new Main23();
    System.out.println(myObj.x);
  }
 } 