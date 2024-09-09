import java.util.*;
public class Leetcode_2848
{
    public static void main(String[] args)
    {
        int arr[][] = {{3,6},{1,5},{4,7}};
        List<List<Integer>> nums = new ArrayList<>();
        for(int i[] : arr)
        {
            List<Integer> in = new ArrayList<>();
            for(int j : i)
            {
                in.add(j);
            }
            nums.add(in);
        }
        System.out.println(numberOfPoints(nums));
    }

    public static int numberOfPoints(List<List<Integer>> nums)
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < nums.size();i++)
        {
            list = nums.get(i);
            int left = list.get(0);
            int right = list.get(1);
            for(int j = left;j <= right;j++)
            {
                set.add(j);
            }
        }

        return set.size();
    }
}
