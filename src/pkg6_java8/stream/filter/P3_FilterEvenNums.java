package stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P3_FilterEvenNums {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 11, 34, 17};
        //Using Array
        int[] evenList = Arrays.stream(arr).filter(num -> num % 2 == 0).toArray();
        //for (int num : evenList) System.out.println(num);
        //Arrays.stream(evenList).forEach(System.out::println);

        //Using List
        List<Integer> nums = Stream.of(1,2,3,4,5,6).filter(n->n%2==0).collect(Collectors.toList());
        nums.forEach(System.out::println);
    }
}
