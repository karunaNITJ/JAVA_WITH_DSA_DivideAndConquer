import java.util.*;
import java.util.PriorityQueue;
public class Heaps1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,2,6,9};
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++) {
            pq.offer(arr[i]);
        }
        for(int i=1;i<k;i++)
        pq.poll();
        System.out.println("Kth Largest Element is: "+pq.poll());
    }
}
