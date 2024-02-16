// Given an array Arr of N positive integers and another number X.
// Determine whether or not there exist two elements in Arr whose sum is exactly X.

// Example 1:

// Input:
// N = 6, X = 16
// Arr[] = {1, 4, 45, 6, 10, 8}
// Output: Yes
// Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
// Example 2:

// Input:
// N = 5, X = 10
// Arr[] = {1, 2, 4, 3, 6}
// Output: Yes
// Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function hasArrayTwoCandidates() which takes the array of integers arr, n and x as parameters and returns a boolean denoting the answer.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 ≤ N ≤ 105
// 1 ≤ Arr[i] ≤ 105


import java.util.*;

public class twopointer {
    static boolean A(int arr[],int n, int x)
    {
        Arrays.sort(arr);
        int left = 0, right = n-1;
        while(left<right)
        {
            int sum = arr[left] + arr[right];
            if(sum==x)
            {
                return true;
            }
            else if(sum<x)
            {
                left ++;
            }
            else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array" );
        for(int i = 0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int x = sc.nextInt();
        boolean result = A(arr,n,x);
        System.out.println("Output= " + (result  ?"Yes!" : "No!"));

    }
}
