package Hashset;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 5};


        Set<Integer> set = new HashSet<>();

        for(int num:arr){
            if(!set.add(num)){
                System.out.println("Duplicate " +num);
            }
        }
    }

}
