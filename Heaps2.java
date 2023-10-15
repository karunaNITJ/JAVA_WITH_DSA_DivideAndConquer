import java.util.*;
public class Heaps2 {
    public static void main(String[] args) {
        int[]arr = {5,4,2,8};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++) {
            pq.offer(arr[i]);
        }
        int cost = 0;
        while(pq.size()>1) {
            int f = pq.poll();
            int s = pq.poll();
            int sum = f+s;
            cost += sum;
            pq.add(sum); 
        }
        System.out.println("The Minimum cost is: "+cost);   
    }
}
