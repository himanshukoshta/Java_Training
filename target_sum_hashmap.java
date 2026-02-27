package training;

import java.util.HashMap;

public class target_sum_hashmap {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            int diff=target-arr[i];
            if(map.containsKey(diff))
            {
                System.out.println(map.get(diff)+" "+i);
            }
            map.put(arr[i], i);
    }
    }
}
