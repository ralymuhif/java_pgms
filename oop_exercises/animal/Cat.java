package oop_exercises.animal;

public class Cat extends Mammal {
   public Cat(String name) {
      super(name);
   }

   public void greets() {
      System.out.println("Meow");
   }

   @Override
   public String toString() {
      return "Cat [Mamma[Animal[name=" + Animal.getName() + "]]";
   }
}
