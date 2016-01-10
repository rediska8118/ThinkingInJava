package ex14;

/**
 * Created by aw3 on 10.01.16.
 */
public class Main {

    static void compareStrings(String str1, String str2){

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str1!=str2);
    }


    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "bbb";

        compareStrings(str1,str2);

    }
}
