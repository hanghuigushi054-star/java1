import java.util.Scanner;
public class day08 {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("年齢を入力してください(1-100): ");
        age = in.nextInt();
       System.out.println(age >= 13 && age < 65);
       System.out.println(age < 13 || age >= 65);
       System.out.println(age >= 13 && age < 65 && age !=20);
       int a,b,x,y,z;
       a =4;
       b =3;
       x = 20;
       y = 30;
       z = 40;
       //22が何故反応しないのか考える必要あり。
       System.out.println(a + 10 > b * 5);
       System.out.println((a + 10) > (b * 5));
       System.out.println(a  > 10 && b < 3);
       System.out.println((a > 10) && (b < 3));
         System.out.println(x && (y || z) );
         System.out.println((x && y) || z);
    }
}