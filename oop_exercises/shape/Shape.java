package oop_exercises.shape;

public abstract class Shape {
   protected String color;
   protected Boolean filled;

   public Shape() {
   }

   public Shape(String color, Boolean filled) {
      this.color = color;
      this.filled = filled;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public Boolean isFilled() {
      return filled;
   }

   public void setFilled(Boolean filled) {
      this.filled = filled;
   }

   abstract double getArea();

   abstract double getPerimeter();

   abstract double getRadius();

   abstract double getLength();

   abstract double getSide();

   @Override
   public String toString() {
      return "Shape [color=" + color + ", filled=" + filled + "]";
   }

}
