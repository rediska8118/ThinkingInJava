package ex13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {

	// A class from java.util to hold Event objects:
	private List<Event> eventList = new LinkedList<Event>();

	public void addEvent(Event c) {
		eventList.add(c);
	}

	public void run() {

		while (eventList.size() > 0) {
			// Make a copy so you’re not modifying the list
			// while you’re selecting the elements in it:

			List<Event> eventListCopy = new LinkedList<Event>(eventList);
			Iterator<Event> iteratorEventListCopy = eventListCopy
					.iterator();
			while (iteratorEventListCopy.hasNext()) {
				Event event = iteratorEventListCopy.next();
				if (event.ready()) {
					System.out.println(event);
					event.action();
					eventList.remove(event);
				}
			}

		}
	}
}
