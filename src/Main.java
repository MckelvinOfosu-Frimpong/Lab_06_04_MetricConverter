import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	double meters = 0;
    double miles;
    double feet;
    double inches;
    String trash = " ";


        Scanner console = new Scanner(System.in);

        System.out.print("Enter the Meters: ");
        if (console.hasNextDouble())
        {
            meters = console.nextDouble();
            console.nextLine();
        }
        else
        {
            trash = console.nextLine();
            System.out.println("Invalid input: " + trash + " Restart program");
            System.exit(0);
        }

        miles = meters / 1609;
        System.out.println( meters + " meters in miles is  " + miles + " mi ");

        feet = meters * 3.281;
        System.out.println( meters + " meters in feet is  " + feet + " ft ");

        inches = meters * 39.37;
        System.out.println( meters + " meters in miles is  " + inches + " in ");



    }
}
