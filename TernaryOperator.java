public class TernaryOperator {
    public static void main(String args[])
    {
        // even number them 10
        // odd number then 20

        int n = 4;
        int result = 0;

        // if(n%2==0)
        //     result = 10;
        // else
        //     result = 20;

// Ternary Operator -- ?:
        result = n%2==0 ? 10 : 20;

        System.out.println(result);

//multiple Ternary operator with multiple conditions

// String year = "senior";
// if (credits < 30) {
//   year = "freshman";
// } else if (credits <= 59) {
//   year = "sophomore";
// } else if (credits <= 89) {
//   year = "junior";
// }
int credits = 90;
String year = credits < 30 ? "freshman" : credits <= 59 ? "sophomore" : credits <= 89 ? "junior" : "senior";

System.out.println(year);


    }
}
