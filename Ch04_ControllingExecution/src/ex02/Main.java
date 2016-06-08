package ex02;

import java.util.Random;

/**
 * Created by aw3 on 10.01.16.
 */
public class Main {
    public static void main(String[] args) {


        Random random1 = new Random();
        Random random2 = new Random();
        for(int i = 0;i < 24; i++){
            int a = random1.nextInt(10);
            int b = random2.nextInt(10);

            if(a>b) System.out.println(a+" > "+b);
            else if(a<b) System.out.println(a+" < "+b);
            else System.out.println(a+" = "+b);
        }
    }

 }
