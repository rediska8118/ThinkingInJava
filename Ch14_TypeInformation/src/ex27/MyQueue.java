package ex27;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	Queue<Command> addElementsToQ() {
		Queue<Command> queue = new LinkedList<Command>();

		queue.add(new Command());
		queue.add(new Command());
		queue.add(new Command());
		queue.add(new Command());
		queue.add(new Command());
		queue.add(new Command());
		
		return queue;
	}

}
