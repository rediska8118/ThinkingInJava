package ex12;

import java.util.List;
import java.util.Map;

import ex11.Coffee;
import ex11.New;

public class ExplicitTypeSpecification {
	static void f(Map<Coffee, List<Coffee>> petPeople) {
	}

	public static void main(String[] args) {
		f(New.<Coffee, List<Coffee>> map());
	}
}
