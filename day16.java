public class day16 {
    static class StudentCard {
        int id;
        String name;
        StudentCard(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    
    public static void main(String[] args) {
        StudentCard a = new StudentCard(1234, "鈴木太郎");
        System.out.println(a.id);
        System.out.println(a.name);
        
        Rectangle r1 = new Rectangle(15, 20);
        Rectangle r2 = new Rectangle(15, 10);
        
        System.out.println("r1 area: " + r1.getArea());
        System.out.println("r2 area: " + r2.getArea());
        System.out.println("r1 > r2: " + r1.isLarger(r2));
    }
    static class Rectangle {
    double width;  // 幅
    double height; // 高さ
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
    boolean isLarger(Rectangle other) {
        if (this.getArea() > other.getArea()) {
            return true;
        } else {
            return false;
        }
    }
}
}