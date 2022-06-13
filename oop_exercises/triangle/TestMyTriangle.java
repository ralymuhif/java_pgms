package oop_exercises.triangle;

public class TestMyTriangle {
   public static void main(String[] args) {
      MyPoint p1 = new MyPoint(-5, -2);
      MyPoint p2 = new MyPoint(-2, -2);
      MyPoint p3 = new MyPoint(-5, -2);

      MyTriangle tri = new MyTriangle(p1, p2, p3);

      System.out.println(tri.getPerimeter());

      System.out.println(tri.getType());

   }
}
