import java.lang.*;

public class Main
{
    public static void main(String args[])
    {   
        String name = "Buddy", mssg = "Happy Birthday";
        while(true)
        {
            Birthday buddy = new Birthday(name, mssg);
            buddy.start();
            
            try 
            {
                buddy.join();
            }
            catch(Exception err)
            {

            }
        }
    }
}