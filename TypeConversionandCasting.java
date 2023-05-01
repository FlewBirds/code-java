/*
 * Demo on Type Conversion and Casting
 *  byte b = 127;
 *  int a = 12;
 *  b=(byte)a; -- this is called casting which is explicit
 *  a = b -- this is conversion which is implicit (automatic)
 * 
 */

public class TypeConversionandCasting {
    public static void main(String args[])

    {

        byte b = 127;
        int a = b;

        int i = 257;
        byte bb = (byte) i;

        float f = 5.6f;
        int t = (int) f;
        System.out.println(a);
        System.out.println(t);

    }
    
}
