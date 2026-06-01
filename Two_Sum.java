package Dsa_Once_Again.Hash_Map_Pattern;

import java.util.HashMap;

public class Two_Sum {
    static void findtwosum(int[] arr,int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

for(int i=0;i<arr.length;i++)
{
    int req=target-arr[i];
    if(map.containsKey(req))
    {
        System.out.println(map.get(req) + " " +i);
    }
    else {
        map.put(arr[i],i);
    }
}
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        findtwosum(arr,9);
    }
}