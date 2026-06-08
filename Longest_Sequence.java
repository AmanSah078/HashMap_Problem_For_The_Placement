import java.util.HashSet;

public class LongestConsecutiveSequence {

    static void longestConsecutive(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();

        // Store all elements in HashSet
        for(int i = 0; i < arr.length; i++)
        {
            set.add(arr[i]);
        }

        int max = 0;

        // Check every element
        for(int i = 0; i < arr.length; i++)
        {
            // Sequence start hai ya nahi
            if(!set.contains(arr[i] - 1))
            {
                int current = arr[i];
                int count = 1;

                // Next consecutive number present hai?
                while(set.contains(current + 1))
                {
                    current++;
                    count++;
                }

                // Update maximum length
                if(count > max)
                {
                    max = count;
                }
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args)
    {
        int[] arr = {100,4,200,1,3,2};

        longestConsecutive(arr);
    }
}