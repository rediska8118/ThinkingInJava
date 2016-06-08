package ex30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewCollectionSequence implements Collection<Pet> {

	private int index = 0;
	private Pet[] pets = new Pet[10];

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pets.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return pets.length == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (Pet pet : pets) {
			if (pet.equals(o)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public Iterator<Pet> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub

		return pets;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Pet e) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (index < pets.length) {
			pets[index++] = e;
			flag = true;
		}

		return flag;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub

		boolean flag = false;

		if (o == null)
			return flag;

		for (Pet pet : pets) {
			if (pet.equals(o)) {
				pet = null;
				flag = true;
				break;
			}
		}

		return flag;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		Iterator<?> iterator = c.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			for (Pet pet : pets) {
				if (pet.equals(obj)) {
					count++;
					break;
				}
			}

		}

		return count == c.size();
	}

	@Override
	public boolean addAll(Collection<? extends Pet> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		int count = 0;
		for (Object obj : c) {
			if (remove(obj))
				count++;
		}
		return count == c.size();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		int count = 0;
		for (Object obj : c) {
			for (Pet pet : pets) {
				if (!obj.equals(pets)) {

					
				}
			}
			count++;
		}
		return count == c.size();
	}

	@Override
	public void clear() {
		for (Pet pet : pets) {
			pet = null;
		}
	}

}
