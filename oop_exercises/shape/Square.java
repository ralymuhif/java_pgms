package oop_exercises.shape;

public class Square extends Rectangle {
   public Square() {
   }

   public Square(double side) {
      this.width = side;
      this.length = side;
   }

   public Square(double side, String color, Boolean filled) {
      this.width = side;
      this.length = side;
      this.color = color;
      this.filled = filled;
   }

   public double getSide() {
      return width;
   }

   public void setSide(double side) {
      this.width = side;
      this.length = side;
   }

   public void setWidth(double side) {
      this.width = side;
   }

   public void setLength(double side) {
      this.length = side;
   }

   @Override
   public String toString() {
      return "Square [Rectangle[Shape[color=" + color + " filled=" + filled + "length=" + length + " width=" + width
            + "]]";
   }

}
