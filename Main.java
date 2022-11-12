import java.lang.*;
import java.util.Scanner;

class Main
{   
    private static void print(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return;
    }

    public static void main(String args[])
    {   
        int size = 6;
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        Sort obj = new Sort(arr, 0, (arr.length) - 1);
        obj.start();
        try
        {
            obj.join();
        }
        catch(Exception e)
        {

        }
        print(arr);
        return;
    }
}