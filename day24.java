public class day24 {
    static int counter = 0;
    static double getSum(int x, int y) {
return x + y;
}
static double getProduct(int x, int y) {
return x * y;
}
static double getRemainder(int x, int y) {
return x % y;
}
static int getCounter() {
return counter;
} 

abstract  static class Shape {
abstract void draw();
}
static class Polyline extends Shape
{
void draw() {
// 折れ線を描画
}
}
static class Rectangle extends Shape
{
void draw() {
// 長方形を描画
}
}
static class Circle extends Shape {
void draw() {
// 円を描画
}
}
public static void main(String args[]){
    System.out.println(getSum(5, 10));
    System.out.println(getProduct(5, 10));
    System.out.println(getRemainder(10, 3));
    System.out.println(getCounter());
    Shape[] shapes = new Shape[3];
    shapes[0] = new Polyline();
    shapes[1] = new Rectangle();
    shapes[2] = new Circle();
    for(int i = 0; i < 3; i++) {
    shapes[i].draw();
    System.out.println("shapes[" + i + "]を呼び出しました。");
    }
} 
}
