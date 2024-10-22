package stream.reduce;

import java.util.Arrays;
import java.util.List;

//Sum of all elements
public class P1_Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        //sum of all elements
       int sumOfNums = nums.stream().reduce((sum, num)->sum+num).get();
        System.out.println(sumOfNums);
    }
}
