public class day15 {
static class Dog {
    String name;
}
static class StudentCard {
    int id;
    String name;
}
public static void main(String[] args) {
Dog dog1 = new Dog();
dog1.name = "Taro";
Dog dog2 = new Dog();
dog2.name = "Pochi";
Dog dog3 = dog2;
System.out.println("名前は"+ dog3.name);
dog3.name = "Jiro";
System.out.println("名前は"  + dog2.name);

StudentCard[] cards = new StudentCard[4];
cards[0] = new StudentCard();
cards[1] = new StudentCard();
cards[2] = new StudentCard();
cards[3] = new StudentCard();
cards[0].id = 1234;
cards[0].name = "鈴木太郎";
cards[1].id = 1235;
cards[1].name = "佐藤花子";
cards[2].id = 1236;
cards[2].name = "山田二郎";

System.out.println("idは" + cards[0].id);
System.out.println("名前は" + cards[0].name);
System.out.println("idは" + cards[1].id);
System.out.println("名前は" + cards[1].name);
System.out.println("idは" + cards[2].id);
System.out.println("名前は" + cards[2].name);
System.out.println("idは" + cards[3].id);
System.out.println("名前は" + cards[3].name);
if(cards[3] == null) {
System.out.println("cards[3]はnull");
} else {
System.out.println("cards[3]はnullでない");
}
}
}
