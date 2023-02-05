
    // Create a Main class
// public class Main27 {
//     int x;  // Create a class attribute
  
//     // Create a class constructor for the Main class
//     public Main27() {
//       x = 5;  // Set the initial value for the class attribute x
//     }
  
//     public static void main(String[] args) {
//       Main27 myObj = new Main27(); // Create an object of class Main (This will call the constructor)
//       System.out.println(myObj.x); // Print the value of x
//     }
//   }
  
  // Outputs 5





//Constructor Parameters


// public class Main27 {
//     int x;
  
//     public Main27(int y) {
//       x = y;
//     }
  
//     public static void main(String[] args) {
//       Main27 myObj = new Main27(5);
//       System.out.println(myObj.x);
//     }
//   }
  
  // Outputs 5


  //Example
  public class Main27 {
    int modelYear;
    String modelName;
  
    public Main27(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      Main27 myCar = new Main27(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
  
  // Outputs 1969 Mustang

