package beakjoon_11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
            return Integer.compare(o2, o1);
         }
      });
      
      while (n--> 0) {
         int t = Integer.parseInt(br.readLine());
         
         if(t == 0) {
            if(!pq.isEmpty()) {
               System.out.println(pq.poll());
            }else {
               System.out.println(0);
            }
         }else {
            pq.add(t);
         }
      }
   }
}