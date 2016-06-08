//: typeinfo/WildcardClassReferences.java
package ex11.typeinfo;

public class WildcardClassReferences {
  public static void main(String[] args) {
    Class<?> intClass = int.class;
    intClass = double.class;
  }
} ///:~
