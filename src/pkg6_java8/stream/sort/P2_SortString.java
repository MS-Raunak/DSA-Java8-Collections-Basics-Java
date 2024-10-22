package stream.sort;

import java.util.Arrays;
import java.util.List;

public class P2_SortString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Krishna", "Shankara", "Vishnu");
        List<String> sortedNAmes = names.stream().sorted().toList();
        System.out.println(sortedNAmes);
    }
}
