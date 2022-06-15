package oop_exercises.shape;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle extends Shape { // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   protected double radius;

   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() { // 1st (default) constructor
      radius = 1.0;
   }

   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double radius) { // 2nd constructor
      this.radius = radius;
   }

   public Circle(double radius, String color, Boolean filled) {
      this.radius = radius;
      this.color = color;
      this.filled = filled;
   }

   /** Returns the radius */
   public double getRadius() {
      return radius;
   }

   // Setter for instance variable radius
   public void setRadius(double radius) {
      this.radius = radius;
   }

   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius * radius * Math.PI;
   }

   /** Returns the area of this Circle instance */
   public double getPerimeter() {
      return (radius + radius) * Math.PI;
   }

   @Override
   public String toString() {
      return "Circle[Shape[color=" + color + " filled=" + filled + " radius=" + radius + "]";
   }

   @Override
   double getLength() {
      return 0;
   }

   @Override
   double getSide() {
      return 0;
   }
}