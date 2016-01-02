package ex31;

/**
 * Created by aw3 on 02.01.16.
 */
public class Main {
    public static void main(String[] args) {
        RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator(20);
        for (Shape shape: randomShapeGenerator){
            shape.draw();
        }
    }
}
