public class day19 {
    class StudentCard {
        int id;
        String name;
        void printInfo() {
            System.out.println(this.id);
            System.out.println(this.name);
        }
    }
    
    class IStudentCard extends StudentCard {
        String nationality; //国籍
    }
    public static void main(String[] args) {
        day19 outer = new day19();
        IStudentCard a = outer.new IStudentCard();
        a.id = 2345;
        a.name = "John Smith";
        a.nationality = "イギリス";
        a.printInfo();
        System.out.println("国籍: " + a.nationality);
    }
}
