import java.util.*;
import java.util.Scanner;
import java.util.PriorityQueue;
class pair {
    char ch ;
    int fre;
    public pair(char ch,int fre) {
        this.ch = ch;
        this.fre = fre;
    }
}
class Heap1RearrangeString {
    public static void main(String[] args) {
        //System.out.println("Helloo");
        // String "aab";
        // only valid for lower English letter
       Scanner sc = new Scanner(System.in);
       String str;
       System.out.println("\nEnter Input String :");
       str = sc.next();
       sc.close();
       int map[] = new int[26];
       for(int i=0;i<str.length();i++) {
        map[str.charAt(i)-'a']++;
       }
       // I create max heap according to maximim frequency of character
       PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->(b.fre - a.fre));
       for(int i=0;i<26;i++) {
        if(map[i] > 0)
        pq.add(new pair((char)(i+'a'),map[i]));
       }

       StringBuilder br = new StringBuilder();
       pair block = pq.poll();
       br.append(block.ch);
       block.fre--;
       while(pq.size() > 0) {
        pair temp = pq.poll();
        br.append(temp.ch);
        temp.fre--;
        if(block.fre > 0) {
            pq.add(block);
        }
        block = temp;
       }
       String ans;
       if(block.fre > 0) 
       ans = "_";
       else 
       ans = br.toString();
       System.out.println("After ReOrganising the string : "+ans);
    }
}