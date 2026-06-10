package Dsa_Once_Again.Hash_Map_Pattern;

import java.util.HashMap;

public class Contingous_Array {

    static void findcontinousarray(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        //base map
        map.put(0,-1);
        int max=0;
        int length=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count--; //It means count=count+1;
            }
            else {
                count++; //It means count=count+1;
            }
            if(map.containsKey(count)) //Kya count ka element map mein as ak key available hain
            {

                length=i-map.get(count); //If yes then we have substract from i to key value
            }
            else {
                map.put(count,i);
            }
            if(length>max)
            {
                max=length;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        {
            int[] arr={0,1};
            findcontinousarray(arr);
        }
    }
}
