package pkg6_java8.stream.map;

import java.util.Arrays;
import java.util.List;

//Make square of each element
public class P1_Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> squreNums = nums.stream().map(num->num*num).toList();
        System.out.println(squreNums);
    }
}
