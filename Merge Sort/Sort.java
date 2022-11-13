import java.lang.*;

public class Sort extends Thread
{   
    int start, end;
    int[] arr;
    public Sort(int[] arr, int start, int end)
    {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run()
    {   
        sort(this.arr, this.start, this.end);
    }

    private void merge(int[] arr, int start, int mid, int end)
    {   
        int[] temp = new int[arr.length];
        int i = start, j = mid + 1, tempIndex = 0;

        while(i <= mid && j <= end)
        {
            if(arr[i] < arr[j])
            {
                temp[tempIndex] = arr[i];
                i++;
            }
            else
            {
                temp[tempIndex] = arr[j];
                j++;
            }
            tempIndex++;
        }

        while(i <= mid)
        {
            temp[tempIndex] = arr[i];
            i++;    
            tempIndex++;
        }
        while(j <= end)
        {
            temp[tempIndex] = arr[j];
            j++;
            tempIndex++;
        }

        tempIndex = i = 0;
        for(i = start; i <= end; i++)
        {
            arr[i] = temp[tempIndex];
            tempIndex++;
        }
        return;
    }

    private void sort(int[] arr, int start, int end)
    {
        int mid = (start + end) / 2;
        if(start >= end)
        {
            return;
        }

        Sort thread_1 = new Sort(arr, start, mid);
        Sort thread_2 = new Sort(arr, mid + 1, end);

        thread_1.start();
        thread_2.start();

        try
        {
            thread_1.join();
            thread_2.join();
        }
        catch(Exception e)
        {

        }
        merge(arr, start, mid, end);
        return;
    }
}