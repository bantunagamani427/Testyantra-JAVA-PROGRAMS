package QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {

	public static void main(String[] args) {
Queue hs=new PriorityQueue<>();
hs.offer("jav");
hs.offer("manual");
hs.offer("automation");
System.out.println(hs);
System.out.println("object ready to remove"+hs.peek());
while(!hs.isEmpty()) {
	System.out.println(hs.poll());
}
	System.out.println("objects are removed"+hs);
	}

}
