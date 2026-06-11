package Dsa_Once_Again.Hash_Map_Pattern;

import java.util.HashMap;

public class Contains_Key {
    static boolean tocheckcontainsdublicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return true;
            }
        map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,1};
       boolean result= tocheckcontainsdublicate(arr);
       System.out.println(result);
    }
}
