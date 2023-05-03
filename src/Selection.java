import java.util.Arrays;

public class Selection {
    public static void main(String args[])
    {
        int[] arr={-78,-79,-89,-100,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int lastIndex=arr.length-i-1;
            int maxIndex=maxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    static int maxIndex(int[] arr,int start, int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
