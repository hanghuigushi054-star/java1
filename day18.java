public class day18 {
    static class StudentCard {
static int counter = 0;
int id;
String name;
StudentCard(int id, String name) {
this.id = id;
this.name = name;
StudentCard.counter++;
//9行目のStudentCard.はクラス名を指定している。counterはstatic変数なので、インスタンスを生成しなくてもアクセスできる。
}
}
class SimpleCalc {
// 引数で渡された底辺と高さの値から三角形の面積を返す
static double getTriangleArea(double base, double height) {
return base * height / 2.0;
}
}
public static void main(String[] args) {
System.out.println("StudentCard.counter=" + StudentCard.counter);
StudentCard a = new StudentCard(12345, "鈴木太郎");
System.out.println("StudentCard.counter=" + StudentCard.counter);
StudentCard b = new StudentCard(12346, "佐藤花子");
System.out.println("StudentCard.counter=" + StudentCard.counter);
System.out.println("a.id=" + a.id);
System.out.println("a.name=" + a.name);
System.out.println("b.id=" + b.id);
System.out.println("b.name=" + b.name);
System.out.println("底辺が10、高さが5の三角形の面積は"
+ SimpleCalc.getTriangleArea(10, 5) + "です");
}
}
