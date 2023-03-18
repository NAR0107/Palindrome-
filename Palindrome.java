public class Palindrome 
 {
   public static void main (String[]args)
   {
     
     int  s= 12321, u= 0, rem, temp;

       temp = s;
     
     while (temp != 0)
       {
     	rem = temp % 10;
     	u= u * 10 + rem;
     	temp /= 10;
       };
   if (s == u)
       System.out.println (s + " is Palindrome");
     else
       System.out.println (s + " is not Palindrome");
   }
 }
