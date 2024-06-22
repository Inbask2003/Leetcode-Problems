/* 
  1310. XOR Queries of a Subarray

  You are given an array arr of positive integers. You are also given the array queries where queries[i] = [lefti, righti].

For each query i compute the XOR of elements from lefti to righti (that is, arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti] ).

Return an array answer where answer[i] is the answer to the ith query.

Example 1:

Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8] 
Explanation: 
The binary representation of the elements in the array are:
1 = 0001 
3 = 0011 
4 = 0100 
8 = 1000 
The XOR values for queries are:
[0,1] = 1 xor 3 = 2 
[1,2] = 3 xor 4 = 7 
[0,3] = 1 xor 3 xor 4 xor 8 = 14 
[3,3] = 8

Example 2:

Input: arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
Output: [8,0,4,4]
 */


public class Leetcode_1310 
{
    public static void main(String[] args) 
    {
        int arr[] = {4,8,2,10};
        int queries[][] = {{2,3},{1,3},{0,0},{0,3}};
        int out[] = xorQueries(arr, queries);
        for(int i : out)
        {
            System.out.print(i+" ");
        }
    }    

    public static int[] xorQueries(int[] arr, int[][] queries) 
    {
        int l = queries.length;
        int out[] = new int[l];
        for(int i = 0;i < l;i++)
        {
            int xor = 0;
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j = start;j <= end;j++)
            {
                xor = xor ^ arr[j];
            } 
            out[i] = xor;
        }
        return out;   
    }

}
