import java.lang.*;
import java.util.Scanner;

public class Main
{   
    public static boolean stop = false;
    public static void main(String args[])
    {   
        WriteOnFile newFile = new WriteOnFile("Jai Shree Ram!", "File.txt");
        newFile.start();

        Scanner sc = new Scanner(System.in);
        while(true)
        {   
            System.out.print("Enter exit : ");
            if((sc.nextLine().toLowerCase()).equals("exit") == true)
            {
                Main.stop = true;
                break;
            }
        }
        return;
    }
}