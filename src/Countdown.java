import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to start at? ");
        int userNumber = scanner.nextInt();
        String output = "";
        while (userNumber >= 0)
        {
            output += (userNumber + ", ");
            userNumber --;
        }
        output += "Time's up! " + userNumber + " seconds have passed!";
            System.out.println(output);
    }
}