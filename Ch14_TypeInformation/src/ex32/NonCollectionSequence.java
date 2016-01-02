package ex32;

import java.util.*;

/**
 * Created by aw3 on 02.01.16.
 */
public class NonCollectionSequence extends PetSequence{

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;
                    public boolean hasNext() { return current > -1; }
                    public Pet next() { return pets[current--]; }
                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = Arrays.asList(pets);
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();

        Iterator<Pet> it = nc.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();

        for(Pet pet:nc.randomized()){
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();

        for(Pet pet:nc.reversed()){
            System.out.print(pet.id() + ":" + pet + " ");
        }




    }
}
