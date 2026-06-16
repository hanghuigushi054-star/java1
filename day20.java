public class day20 {
    class X {
        X() { System.out.println("[X]"); }
        void a() { System.out.println("[x.a]"); }
        void b() { System.out.println("[x.b]"); }
    }
    
    class Y extends X {
        Y() { super(); System.out.println("[Y]"); }
        void a() { System.out.println("[y.a]"); }
    }
    
    class A {
        A() { System.out.println("[A()]"); }
        A(int i) { System.out.println("[A(int i)]"); }
    }
    
    class B extends A {
        B() { super(); System.out.println("[B()]"); }
        B(int i) { super(i); System.out.println("[B(int i)]"); }
    }
    
    class C extends B {
        C() { super(); }
        void a() { System.out.println("[c.a]"); }
        void b() { System.out.println("[c.b]"); }
    }
    
    public static void main(String[] args) {
        System.out.println("new Y()を生成");
        Y y = new day20().new Y();
        System.out.println("y.a()を呼び出す");
        y.a();
        System.out.println("y.b()を呼び出す");
        y.b();
        
        System.out.println("new B()を生成");
        System.out.println("new B(10)を生成");
        System.out.println("new C()を生成");
        C c = new day20().new C();
        System.out.println("c.a()を呼び出す");
        c.a();
        System.out.println("c.b()を呼び出す");
        c.b();
    }
}
