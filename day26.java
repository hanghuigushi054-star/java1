public class day26 {
    // 1. mainメソッドで使えるように static を追加
    static interface I {}
    static abstract class A {}
    static class B extends A {}
    static class C implements I {}

    public static void main(String[] args) {
        
        // --- 実行できる（正しい）コード ---
        
        B b1 = new B(); // 普通にBを作る
        C c1 = new C(); // 普通にCを作る
        
        // 2. 変数名が被らないように b2, c2 に変更
        A b2 = new B(); // BはAを継承しているのでOK
        I c2 = new C(); // CはIを実装しているのでOK
        
        System.out.println("エラーなしで実行できました！");

        // --- 以下はエラーになるためコメントアウト（//）しています ---
        // A a = new A(); 
        // 理由: abstractクラス（抽象クラス）は直接 new できません。
        // I i = new I(); 
        // 理由: interface（インターフェース）は直接 new できません。
        // B a2 = new A(); 
        // 理由: Aは new できない上に、親（A）を子（B）の箱にそのまま入れることはできません。
        // I b3 = new B(); 
        // 理由: クラスBはインターフェースIを実装（implements）していないため、繋がりがありません。
    }
}