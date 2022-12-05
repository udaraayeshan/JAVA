/* 
 
 * You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.


*/

//Java Break
public class Main15 {
    public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
        if (i == 4) {
          break;
        }
        System.out.println(i);
      }  


      //Java Continue


      for (int i = 0; i < 10; i++) {
        if (i == 4) {
          continue;           //4 print wenne  nathuwa anith tika continue we
        }
        System.out.println(i);
      }  

      //Break and Continue in While Loop
      //Break Example
      int i = 0;
      while (i < 10) {
        System.out.println(i);
        i++;
        if (i == 4) {
          break;
        }
      }
       

      int i1 = 0;
      while (i1 < 10) {
        if (i1 == 4) {
          i++;
          continue;
        }
        System.out.println(i1);
        i++;
      }
     



    }
  }