import java.sql.SQLOutput;
import java.util.Scanner;
public class SwappingOfTwoNumbersWithoutThirdVariable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int a = sc.nextInt();


        System.out.println("Please enter second number");
        int b = sc.nextInt();

        System.out.println("Value of a before swapping " +a);
        System.out.println("Value of b before swapping "+b);
        //a=10;
        //b=50;
        a=a+b;//a=60
        b=a-b;//b=10
        a=a-b;//a=50

        System.out.println("Value of a after swapping " +a);
        System.out.println("Value of b after swapping "+b);






    }


}
