
//16.1 Java Arrays

/* 
 Java Arrays
Arrays are used to store multiple values in a single variable,
instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets: String[] cars;
We have now declared a variable that holds an array of strings. To insert values to it,
 you can place the values in a comma-separated list, inside curly braces:
   

 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
 int[] myNum = {10, 20, 30, 40};
*/

//Access the Elements of an Array

public class Main16 {
    public static void main(String[] args) {
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      System.out.println(cars[0]);


      //Change an Array Element
      String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
      cars1[0] = "Opel";
      System.out.println(cars1[0]);
      // Now outputs Opel instead of Volvo


      //16.2 Java Arrays Loop
    

      /*Loop Through an Array
You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

*/
      String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
      for (int i = 0; i < cars2.length; i++) {
        System.out.println(cars2[i]);
      }

// /Loop Through an Array with For-Each
      String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
      for (String i : cars3) {
        System.out.println(i);
      }

      //16.3 Java Multi-Dimensional Arrays
      /* 
       Multidimensional Arrays
A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form,
like a table with rows and columns.

To create a two-dimensional array, add each array within its own set of curly braces:
      */
    
     // int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[0][2]);

    //Change Element Values

    int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
    myNumbers1[1][2] = 9;
      System.out.println(myNumbers1[1][2]); // Outputs 9 instead of 7

    //Loop Through a Multi-Dimensional Array
    int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers2.length; ++i) {
       for(int j = 0; j < myNumbers2[i].length; ++j) {
          System.out.println(myNumbers2[i][j]);
       }
    }


    }
  }
  
