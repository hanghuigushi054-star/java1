public class day13 {
    public static boolean isPositiveNumber(int i) {
        if(i > 0) {
            return true;
        } else {
            return false;
        }
        //同じスタイル・フォーマットで書かなければ反応しないことを確認
    }
    public static void methodA() {
System.out.println("引数はありません");
}
public static void methodA(int i) {
System.out.println("int型の値" + i + "を受け取りました");
}
public static void methodA(double d) {
System.out.println("double型の値" + d + "を受け取りました");
}
public static void methodA(String s) {
System.out.println("文字列" + s + "を受け取りました");
}

    public static void main(String[] args) {
        int i = -10;
        if(isPositiveNumber(i)) {
            System.out.println("iの値は正です");
        } else {
            System.out.println("iの値は負またはゼロです");
        }
        methodA();
        methodA(0);
        methodA(0.33);
        methodA("Hello World");
    }
}
