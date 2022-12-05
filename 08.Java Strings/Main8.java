
//Java Strings

//[8.1 Strings]

public class Main8 {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        //String Length-length()
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //More String Methods
        //There are many string methods available, for example toUpperCase() and toLowerCase():
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"

        //Finding a Character in a String
        //The indexOf() method returns the index (the position) of 
        //the first occurrence of a specified text in a string (including whitespace):
        String txt2 = "Please locate where locate occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        //[8.2 Java String Concatenation]
        //The + operator can be used between strings to combine them. This is called concatenation:

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName+ " "+ lastName); 
        //Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
     
       //8.3 Java Numbers and Strings

         // WARNING!
 
        // Java uses the + operator for both addition and concatenation.

        // Numbers are added. Strings are concatenated.

        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)
        System.out.println(z);

        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1;  // z will be 1020 (a String) 
        System.out.println(z1); 

        //If you add a number and a string, the result will be a string concatenation:
        String x3 = "20";
        int y3 = 10;
        String z3 = x3 + y3;
        System.out.println(z3);

        //8.4 [Java Special Characters]
        //Because strings must be written within quotes,
        // Java will misunderstand this string, and generate an error:
        
        //String txt = "We are the so-called "Vikings" from the north.";
          
        // The solution to avoid this problem, is to use the backslash escape character. 
        // The backslash (\) escape character turns special characters into string characters: 
    
      // ES     Re(Print)    DE
        // \'	'	      Single quote
        // \"	"	      Double quote
       // \\	\	      Backslash

       String txt4 = "We are the so-called \"Vikings\" from the north.";
       System.out.println(txt4);

       String txt5 = "It\'s alright.";
       System.out.println(txt5);

       String txt6 = "The character \\ is called backslash.";
       System.out.println(txt6);
      


       //Other common escape sequences that are valid in Java are:
                // \n	New Line
                 String txt7 = "Hello\nWorld!";
                 System.out.println(txt7);	
               //  \r	Carriage Return	
                 String tx = "Hello\rWorld!";
                 System.out.println(tx);
               //  \t	Tab	
                 String tx1 = "Hell\toWorld!";
                 System.out.println(tx1);

               //  \b	Backspace	
               String tx2 = "Hell\bo World!";
               System.out.println(tx2);
               
               //  \f	Form Feed 
                 
  
    }
}