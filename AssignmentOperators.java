import java.io.ObjectInputFilter.Status;

public class AssignmentOperators {
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 5;

        // num1 = num1 + 2;
        // num1 += 2;
        num1++;                     // post-increment
        // also we can use ++num1   // pre-increment

        // num2 -= 2;
        num2--;

        int result = num1++;

        System.out.println(result);
        System.out.println(num2);

        int x = 6;
        int y = 5;

        boolean result1 = x < y;

        boolean result2 = x == y;

        System.out.println(result1);
        System.out.println(result2);

// Logical Operator
        /*
         * AND &, | OR, ! Not
         * 
         * short circuit || or && 
         * 
         * 
         */
        
         int aa = 7;
         int bb = 5;
         int xx = 5;
         int yy = 9;

         boolean result11 = aa > bb;
        
    }



}
