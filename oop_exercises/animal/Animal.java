package oop_exercises.animal;

public class Animal {
   private static String name;

   public Animal(String name) {
      Animal.name = name;
   }

   public static String getName() {
      return name;
   }

   @Override
   public String toString() {
      return "Animal [name=" + name + "]";
   }
}
