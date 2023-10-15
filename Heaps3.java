import java.util.*;
public class Heaps3 {
    public static void main(String[] args) {
        //String wrods[] = {"i","love","leetcode","i","love","coding"};
        String wrods[] = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        List<String> res = new ArrayList<String>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<wrods.length;i++) {
            if(map.containsKey(wrods[i]))
            map.put(wrods[i],map.get(wrods[i])+1);
            else 
            map.put(wrods[i],1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(
            (a,b)->a.getValue()==b.getValue()?b.getKey().compareTo(a.getKey()):a.getValue()-b.getValue());
            for(Map.Entry<String,Integer> entry:map.entrySet()) {
                pq.offer(entry);
                if(pq.size()>k) 
                pq.poll();
            }
        while(!pq.isEmpty()) res.add(0,pq.poll().getKey());
        for(String str : res) 
        System.out.print(str+" ");
    }
}