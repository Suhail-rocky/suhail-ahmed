import java.awt.geom.*;
import java.util.Scanner;

public class elevator
{

    static int floor = 0, choice1, person = 0;
    public static void ElevatorUp()
    {
        System.out.println("The elevator is on it's way up...");

        for (person = choice1; choice1>=floor; floor++)

            System.out.println(floor);

        System.out.println("The elevator has arrived");
    }

    public static void ElevatorDown()
    {
        System.out.println("The elevator is on it's way down...");
        for (person = choice1; choice1<=floor; floor--)

            System.out.println(floor);

        System.out.println("The elevator has arrived");
    }


    public static void main(String args[])
    { 
    	Scanner Keyboard = new Scanner(System.in);

        floor = ((int) (Math.random() * 10 + 1));

        System.out.println("The elevator is now on floor " +floor);
        System.out.print("Which floor are you at now (0-10) where 0 = basement: ");
        choice1 = Keyboard.nextInt();

        if(floor == choice1)
        {
            System.out.println("Enter the elevator");
        }

        else if(floor > choice1)
        {
            ElevatorDown();
        }

        else if(floor < choice1)
        {
            ElevatorUp();
        }

        System.out.println("To which floor would you want to go (0-10) where 0 = basement");
        choice1 = Keyboard.nextInt();

        if(floor > choice1)
        {
            ElevatorDown();
        }

        else if(floor < choice1)
        {
            ElevatorUp();
        }

    }


}