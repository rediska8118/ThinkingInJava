package ex27;

public class Consumer {

	public static void main(String[] args) {
		MyQueue myqueue = new MyQueue();

		for (Command command : myqueue.addElementsToQ()) {

			command.operation();
		}

	}
}
