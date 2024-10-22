package stream.max;

import java.util.Arrays;
import java.util.List;

public class P1_Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23,4,12,56);

        //int maxEle = nums.stream().max((a,b)-> a.compareTo(b)).get();
        int maxEle = nums.stream().max(Integer::compareTo).get();
        System.out.println(maxEle);
    }
}
