import javax.lang.model.util.ElementScanner14;

public class ConditionalStatements {
    
    public static void main(String a[]) 
    {

        int x = 1;

        // if(x>10)
        // System.out.println("Hello");

        if(x>10 && x<=20)
        {
        System.out.println("Hello");
        System.out.println(x);
        }
        else if(x==2)
        System.out.println("World");
        else
            System.out.println("Failed");


    }
}
