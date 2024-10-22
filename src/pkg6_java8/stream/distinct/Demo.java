package pkg6_java8.stream.distinct;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,2,4,1,5,5);

        List<Integer> uniqueNums = nums.stream().distinct().toList();
        System.out.println(uniqueNums);
    }
}
