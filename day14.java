public class day14 {
    static class book {
        String title;
        String author;
        int year;
    }

    static class StudentCard {
        int id;
        String name;
    }

    public static void main(String[] args) {
        book book1 = new book();
        book1.title = "桃太郎";
        book1.author = "太朗";
        book1.year = 2020;

        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Year: " + book1.year);

        StudentCard a = new StudentCard();
        a.id = 1234;
        a.name = "鈴木太郎";

        StudentCard b = new StudentCard();
        b.id = 1235;
        b.name = "佐藤花子";

        System.out.println("aのidは" + a.id);
        System.out.println("aのnameは" + a.name);
        System.out.println("bのidは" + b.id);
        System.out.println("bのnameは" + b.name);
    }
}