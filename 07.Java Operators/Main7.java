/*Java Operators
Operators are used to perform operations on variables and values.

int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)

Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators

1.Arithmetic operators
Arithmetic operators are used to perform common mathematical operations.

+	Addition	-Adds together two values	- x + y	
-	Subtraction	-Subtracts one value from another	- x - y	
*	Multiplication	-Multiplies two values	- x * y	
/	Division	-Divides one value by another	- x / y	
%	Modulus-	Returns the division remainder	- x % y	
++	Increment	-Increases the value of a variable by 1- ++x	
--	Decrement	-Decreases the value of a variable by 1- --x

2.Java Assignment Operators
Assignment operators are used to assign values to variables.

 o      e        sa
=	- x = 5	    x = 5	
+=	- x += 3	x = x + 3	
-=	- x -= 3	x = x - 3	
*=	- x *= 3	x = x * 3	
/=	- x /= 3	x = x / 3	
%=	- x %= 3	x = x % 3	
&=	- x &= 3	x = x & 3	
|=	- x |= 3	x = x | 3	
^=	- x ^= 3	x = x ^ 3	
>>=	- x >>= 3	x = x >> 3	
<<=	- x <<= 3	x = x << 3

3.Java Comparison Operators

Comparison operators are used to compare two values.
This is important in programming, because it helps us to find answers and make decisions.
 
==	Equal to	                x == y	
!=	Not equal	                x != y	
>	Greater than	            x > y	
<	Less than	                x < y	
>=	Greater than or equal to	x >= y	
<=	Less than or equal to	    x <= y


4.Java Logical Operators

&& 	Logical and	Returns true if both statements are true	             x < 5 &&  x < 10	
|| 	Logical or	Returns true if one of the statements is true	         x < 5 || x < 4	
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

 */




public class Main7 {
    public static void main(String[] args) {
        //1
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);  
        //2
        int x = 10;
        x += 5;
        System.out.println(x); 
        //3
        int u = 5;
        int y = 3;
        System.out.println(u == y); // returns false because 5 is not equal to 3

         //4
         int o = 5;
         System.out.println(o > 3 && o < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
         int x1 = 5;
         System.out.println(x1 > 3 || x1 < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
         int i = 5;
         System.out.println(!(i > 3 && i < 10)); // returns false because ! (not) is used to reverse the result
      }


    
}
