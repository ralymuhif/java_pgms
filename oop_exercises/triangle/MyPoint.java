package oop_exercises.triangle;

public class MyPoint {
   private int x;
   private int y;

   public MyPoint() {
      this.x = 0;
      this.y = 0;

   }

   public MyPoint(int x, int y) {
      this.x = x;
      this.y = y;

   }

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

   public int[] getXY() {
      int[] xy = { x, y };
      return xy;
   }

   public void setXY(int x, int y) {
      this.x = x;
      this.y = y;
   }

   @Override
   public String toString() {
      return "MyPoint [x=" + x + ", y=" + y + "]";
   }

   public double distance(int x, int y) {
      return Math.sqrt(((this.y - y) * (this.y - y)) + ((this.x - x) * (this.x - x)));
   }

   public double distance(MyPoint another) {
      return distance(another.x, another.y);
   }

   public double distance() {
      return distance(0, 0);
   }

}
