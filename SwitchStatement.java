public class SwitchStatement {
    public static void main(String a[])
    {

        int n = 1;

        // if(n==1)
        //     System.out.println("Monday");
        // else if(n==2)
        //      System.out.println("Tuesday");
        // else if(n==3)
        //      System.out.println("Wednesday");
        // else if(n==4)
        //      System.out.println("Thursday");
        // else if(n==5)
        //      System.out.println("Friday");
        // else if(n==6)
        //      System.out.println("Saturday");
        // else if(n==7)
        //      System.out.println("Sunday");
        // else
        //      System.out.println("Invalid input .. please add number between 1..7 only");

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input .. please enter number from 1..7 only");
        }
  


    }
}

// there is another way in java to break.. check it?