package ex31;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by aw3 on 02.01.16.
 */
public class RandomShapeGenerator implements Iterable<Shape>{

    private Shape[] shapes;

    RandomShapeGenerator(int number){
        shapes = new Shape[number];
        for(int i=0;i<number;i++){
            shapes[i] = next();
        }
    }

    public Iterator<Shape> iterator(){
        return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext() {
                return index < shapes.length;
            }
            public Shape next() {
                return shapes[index++];
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }


    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
