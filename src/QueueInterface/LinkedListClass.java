package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListClass {

	public static void main(String[] args) {
		Queue a = new LinkedList<>();
		a.offer("java");
		a.offer("manual");
		a.offer("selenium");
		a.offer("SQL");
		a.add(1);
		System.out.println(a);
		System.out.println("ready to remove="+a.peek());
		while(!a.isEmpty()) {
			System.out.println(a.poll());
		}
		System.out.println("objects removed");
		System.out.println(a);
	}

}
