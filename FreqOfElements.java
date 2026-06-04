package Dsa_Once_Again.Hash_Map_Pattern;

import java.util.HashMap;

public class FreqOfElements {
    static void tofindthefreqofelements(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        for(Integer key : map.keySet())
        {
            System.out.println(key + " -> " + map.get(key));
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1};
        tofindthefreqofelements(arr);
    }
}
