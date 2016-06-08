//: typeinfo/pets/ForNameCreator.java
package ex11.typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "ex11.typeinfo.pets.Mutt",
    "ex11.typeinfo.pets.Pug",
    "ex11.typeinfo.pets.EgyptianMau",
    "ex11.typeinfo.pets.Manx",
    "ex11.typeinfo.pets.Cymric",
    "ex11.typeinfo.pets.Rat",
    "ex11.typeinfo.pets.Mouse",
    "ex11.typeinfo.pets.Hamster",
    "ex11.typeinfo.pets.Gerbil"
    
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
