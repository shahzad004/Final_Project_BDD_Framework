package test;

import java.sql.SQLOutput;

public class Practice {

    public static void main (String[] args){

       int a= 14;
       int b=36;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using XOR operation
        System.out.println( a = a ^ b);  // Step 1: a becomes the XOR of a and b
        System.out.println(b = a ^ b);  // Step 2: b becomes the original value of a
        System.out.println(a = a ^ b);  // Step 3: a becomes the original value of b

        // Output after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);












    }
}
