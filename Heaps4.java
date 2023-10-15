import java.util.*;
public class Heaps4 {
    public static int stonesGame(int []arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:arr) {
            pq.offer(i);
        }
        while(pq.size()>1) {
            int y = pq.poll();
            int x = pq.poll();
            if(x==y) continue;
            else 
            pq.offer(y-x);
        }
        if(!pq.isEmpty())
        return pq.poll();
        return 0;
    }
    public static void main(String[] args) {
       int input[] = {2,7,4,1,8,1};
       System.out.println("The Desired Output is :"+stonesGame(input));
    }
}
