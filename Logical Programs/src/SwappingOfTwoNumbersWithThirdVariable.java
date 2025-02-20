import java.util.Scanner;

public class SwappingOfTwoNumbersWithThirdVariable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int a = sc.nextInt();


        System.out.println("Please enter second number");
        int b = sc.nextInt();

        int temp;

        System.out.println("Value of a before swapping " +a);
        System.out.println("Value of b before swapping "+b);


        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a after swapping " +a);
        System.out.println("Value of b after swapping "+b);






    }


}
