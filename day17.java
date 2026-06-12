public class day17 {
    static class StudentCard {
       int id;
       String name;
       StudentCard()
     {
      this.id = 0;
      this.name = "未定";
     }
      StudentCard(String name)
      {
         this.id = 0;
         this.name = name;
     }
      StudentCard(int id, String name)
      {
         this.id = id;
         this.name = name;
      }
    }
public static void main(String[] args) {
    StudentCard a = new StudentCard();
    StudentCard b = new StudentCard("鈴木太郎");
    StudentCard c = new StudentCard(1235, "佐藤花子");
    System.out.println("a.id: " + a.id);
    System.out.println("a.name: " + a.name);
    System.out.println("b.id: " + b.id);
    System.out.println("b.name: " + b.name);
    System.out.println("c.id: " + c.id);
    System.out.println("c.name: " + c.name);
}
}
