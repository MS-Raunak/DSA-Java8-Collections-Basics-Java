package pkg6_java8.stream.sort;

import java.util.Arrays;
import java.util.List;

public class P1_SortNum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,45,2,34,5,14);

        //List<Integer> sortedList = nums.stream().sorted().toList();
        //System.out.println(sortedList);

        //Sort in descending order
        List<Integer> sortedListDesc = nums.stream().sorted((a,b)-> b.compareTo(a)).toList();
        System.out.println(sortedListDesc);
    }
}
