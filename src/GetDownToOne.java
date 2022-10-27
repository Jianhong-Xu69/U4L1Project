import java.util.Scanner;

public class GetDownToOne
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to halve to one? ");
        int userNumber = scanner.nextInt();
        int halflings = 0;
        while (userNumber != 1)
        {
            userNumber /= 2;
            System.out.println(userNumber);
            halflings ++;
        }
        System.out.println("There are " + halflings + " halvings to get to 1");
    }
}
