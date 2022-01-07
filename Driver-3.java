import java.util.Scanner;
/**
 * This is a driver class which will ask user for the input of a string and and integer for conversion.
 *
 * @author R. Shiroya
 * @version 02-20-2020
 */
public class Driver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = keyboard.nextLine();
        System.out.println("Please enter an integer for conversion: ");
        int conv = keyboard.nextInt();
        
        
    }
}
