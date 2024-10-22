package pkg7_advance_dsa.queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

//Find nth min element in an array using priority queue
public class NthMinEleInArr {
    public static void main(String[] args) {
        int[]arr ={4,2,7,9,1,11};

        findNthMin(arr, 3);
    }

    private static void findNthMin(int[] arr, int k) {
        Queue<Integer> queue = new PriorityQueue<>((e1,e2)->e2-e1);

        for (int ele: arr){
            queue.add(ele);
            if (queue.size() > k){
                queue.remove();
            }
        }
        System.out.println(queue.poll());
    }
}
