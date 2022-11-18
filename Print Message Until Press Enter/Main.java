import java.lang.*;
import java.util.Scanner;

public class Main
{   
    public static boolean start = true;
    public static void main(String args[])
    {   
        Message newThread = new Message("Get Well Soon Buddy!");
        newThread.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        Main.start = false;
    }
}