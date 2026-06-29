public class day25 {
    // 1. mainから使えるように static を追加
    static interface HasGetAreaMethod {
        double getArea();
    }

    // 1. mainから使えるように static を追加
    static class Rectangle implements HasGetAreaMethod {
        // 2. 変数を定義する
        double width = 10.0;
        double height = 5.0;

        // 3. インターフェースの実装には public が必要
        public double getArea() { 
            return width * height; 
        }
    }
    // 1. mainから使えるように static を追加
    static class Circle implements HasGetAreaMethod {
        // 2. 変数を定義する
        double r = 3.0;
        // 3. インターフェースの実装には public が必要
        public double getArea() { 
            return r * r * 3.14; 
        }
    }
    public static void main(String[] args) {
        // 4. インスタンスの生成を main メソッドの中へ移動
        HasGetAreaMethod rect = new Rectangle(); 
        HasGetAreaMethod circle = new Circle();
        System.out.println(rect.getArea());
        System.out.println(circle.getArea());
    }
}