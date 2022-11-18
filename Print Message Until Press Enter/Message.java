import java.lang.*;

public class Message extends Thread
{   
    private String mssg;
    Message(String mssg)
    {
        this.mssg = mssg;
    }

    public void run()
    {
        while(Main.start == true)
        {
            System.out.println(this.mssg);
            try
            {
                Thread.sleep(1500);
            }
            catch(Exception err)
            {

            }
        }   
    }
}