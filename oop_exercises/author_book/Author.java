package oop_exercises.author_book;

public class Author {
   private String name;
   private String email;

   public Author(String name, String email) {
      this.name = name;
      this.email = email;
   }

   public String getName() {
      return this.name;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String toString() {
      return "Author[name= " + name + ",email= " + email + "]";
   }
}
