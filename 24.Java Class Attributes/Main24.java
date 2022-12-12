//Java Class Attributes

/*In the previous chapter, we used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class:

Example
Create a class called "Main" with two attributes: x and y:

public class Main {
  int x = 5;
  int y = 3;
}

[2.Accessing Attributes]
You can access attributes by creating an object of the class, and by using the dot syntax (.):

The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:

Example
Create an object called "myObj" and print the value of x:

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}

[3.Modify Attributes]

You can also modify attribute values:

Example
Set the value of x to 40:

public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}



*/
//Change the value of x to 25:
public class Main24 {
    int x = 10;
  
    public static void main(String[] args) {
      Main24 myObj = new Main24();
      myObj.x = 25; // x is now 25
      System.out.println(myObj.x);
      udara myobj1 =new udara();
      myobj1.y =34;
      System.out.println(myobj1.y);
      myobj1.y =34;

    }
  }

  class udara {

   int y = 6;
   
   
  }

