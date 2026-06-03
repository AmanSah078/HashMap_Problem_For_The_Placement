package Dsa_Once_Again.Hash_Map_Pattern;

import java.util.HashMap;

public class Intersection {

    static void findtheintersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        //This is the First Loop which is only responsible to store the element inside the map
        //Map->Is internally Empty na dude
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], i);
        }

        //This is the second loop which is responsible to check ki kya jo second array ka eleemnt hain wo phle array mein as a
        //Key store hua hain kya if yes then print
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
System.out.print(arr2[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={2,3,4};
        findtheintersection(arr1,arr2);
    }
}

