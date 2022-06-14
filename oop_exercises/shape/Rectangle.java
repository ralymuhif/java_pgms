package oop_exercises.shape;

public class Rectangle extends Shape {
   protected double length;
   protected double width;

   public Rectangle() {
      this.length = 1.0;
      this.width = 1.0;
   }

   public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }

   public Rectangle(double length, double width, String color, Boolean filled) {
      this.length = length;
      this.width = width;
      this.color = color;
      this.filled = filled;
   }

   public double getLength() {
      return length;
   }

   public void setLength(double length) {
      this.length = length;
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getArea() {
      return length * width;
   }

   public double getPerimeter() {
      return (length + width) * 2;
   }

   @Override
   public String toString() {
      return "Rectangle[Shape[color=" + color + " filled=" + filled + "length=" + length + " width=" + width + "]";
   }

   @Override
   double getRadius() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   double getSide() {
      // TODO Auto-generated method stub
      return 0;
   }
}
