package ex11;

/**
 * Created by aw3 on 10.01.16.
 */
public class Main {
    public static void main(String[] args) {

        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 28; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}
