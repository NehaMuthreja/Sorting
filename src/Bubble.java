import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={12,11,13,14,15};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr)
    {
        int n=arr.length;
        boolean sorted;
        for(int i=0;i<n;i++)
        {
            sorted=true;
            for(int j=1;j<n-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    sorted=false;
                }
            }if(sorted)
        {
            break;
        }
        }
    }
}

//Bubble sort
//
//
//
//Algorithm :-
//
//        1)boolean sorted;
//        2)i=0,j=1;
//        3)Is i<arr.length:
//                 sorted=true //in each pass consider it to be sorted until a swap happens
//                 Is j<=arr.length-i-1:
//                      if(arr[j-1]>arr[j]):
//                       temp=arr[j-1]
//                       arr[j-1]=arr[j]
//                       arr[j]=temp
//                       sorted=false //if a swap happens that means the  array is still not sorted hence continue with the passes
//                 j++;
//         If(sorted):
//             break;
//        i++;
//
//
//
//        Algorithm explained: -
//
//        1)Take a boolean variable “sorted”.
//        2)Run a for loop starting from index 0 to length-1
//        Also set sorted=’true’(this means that we consider that for the current ith pass all the elements are sorted)
//        3)In the first loop(i loop) take a j loop which will check if all the elements are sorted or not.
//        Run j loop from 1 to n-i-1  or till <n-i(We start from j=1 because we will compare all the elements from the previous elements).
//        4)In j loop, use the if condition to check if arr[j-1]>arr[j] or not, if for any two adjacent j values this condition is satisfied that means array was not sorted for the current pass, hence change sorted=false and swap those values which were not sorted.
//        5)As the j loop ends, check if the value of “sorted” is true or false, if true that means no swap has taken place in the current ith pass so just break out of the loop and no need to make further comparions.
//
//
//
//        Best case time complexity: O(N)
//        Worst case time complexity: O(N2)
//
//
//
//
//
//
