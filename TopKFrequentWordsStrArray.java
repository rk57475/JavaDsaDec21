package dsa;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentWordsStrArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
		int k = 4;
		    Map<String, Integer> count = new HashMap<String, Integer>();
	        List<String> result = new LinkedList<String>();
	        for (String word : words) {
	            count.put(word, count.getOrDefault(word, 0) + 1);
	        }
	        Queue<String> pq = new PriorityQueue<String>((w1, w2) -> count.get(w1).equals(count.get(w2)) ? w1.compareTo(w2) : count.get(w2) - count.get(w1));
	        for (String word : count.keySet()) {
	            pq.offer(word);
	        }
	        for (int i = 0; i < k; i++) {
	            result.add(pq.poll());
	        }
	        System.out.println(result);
	}
}