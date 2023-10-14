import java.util.PriorityQueue;
//import java.util.*;
public class HeapsPilesOfStone {
    public static void main(String[] args) {
        int a = 4,b = 4,c = 6;
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->y-x);
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int score = 0;
        while(pq.size()>=2) {
            int p = pq.poll();
            int s = pq.poll();
            p--;s--;
            score++;
            if(p > 0) pq.add(p);
            if(s > 0) pq.add(s);
        }
        System.out.println("The Desired Outpout is : "+score);
    }
}
