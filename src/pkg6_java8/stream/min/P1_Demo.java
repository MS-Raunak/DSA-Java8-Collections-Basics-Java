package pkg6_java8.stream.min;

import java.util.Arrays;
import java.util.List;

public class P1_Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23,4,12,56,4);

        int minEle = nums.stream().min((a,b)-> a.compareTo(b)).get();
        //int minEle = nums.stream().min(Integer::compareTo).get();
        System.out.println(minEle);

       int c = nums.stream().reduce((sum, num)->sum+num).get();
        System.out.println(c);

    }
}
