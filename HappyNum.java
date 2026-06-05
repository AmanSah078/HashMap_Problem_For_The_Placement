package Dsa_Once_Again.Hash_Map_Pattern;

import java.util.HashSet;

public class HappyNum {

    static void happyNumber(int n)
    {
        // To detect cycle
        HashSet<Integer> set = new HashSet<>();

        while(n != 1)
        {
            // If same number comes again
            // then it is not a happy number
            if(set.contains(n))
            {
                System.out.println("Not Happy Number");
                return;
            }

            // Store current number
            set.add(n);

            int sum = 0;

            // Process all digits of n
            while(n > 0)
            {
                // Get last digit
                int digit = n % 10;

                // Add square of digit
                sum = sum + (digit * digit);

                // Remove last digit
                n = n / 10;
            }

            // Move to next number
            n = sum;
        }

        System.out.println("Happy Number");
    }

    public static void main(String[] args)
    {
        happyNumber(19);
    }
}