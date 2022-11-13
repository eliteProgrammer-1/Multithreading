import java.lang.*;

public class Birthday extends Thread
{   
    private String name, mssg;
    public Birthday(String name, String mssg)
    {
        this.name = name;
        this.mssg = mssg;
    }

    public void run()
    {
        System.out.println(mssg + " " + name + "!!");
    }
}