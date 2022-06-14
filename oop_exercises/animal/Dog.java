package oop_exercises.animal;

public class Dog extends Mammal {
   public Dog(String name) {
      super(name);
   }

   public void greets() {
      System.out.println("Woof");
   }

   public void greets(Dog another) {
      System.out.println("Woooof");
   }

   @Override
   public String toString() {
      return "Dog [Mammal[Animal[name=" + Animal.getName() + "]]";
   }

   public static void main(String[] args) {
      Dog dog = new Dog("Doggy");
      Dog dog2 = new Dog("Doggy2");

      System.out.println(dog);
      dog.greets();
      dog.greets(dog2);
   }
}
