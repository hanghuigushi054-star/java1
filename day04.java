import java.util.Scanner;
public class day04 {
    
    public static void main(String[] args) {
        int  i;
        i = 11;
        i ++;
        i /= 2;
        System.out.println("iの値は" + i);
        int j;
        j = i * i;
        System.out.println("jの値は" + j);
        int a;
        int b  = ( a = 2 + 3 ) * 2;
        System.out.println("aの値は" + a);
        System.out.println("bの値は" + b);
        int c = 5;
        double d = (double)c;
        System.out.println("dの値は" + d);
        int f = 6;
        double g =3.14;
        System.out.println(f + g);
        int h = 5;
        int k = 2;
        double l = (double)h / (double)k;
        double m = h / k;
        System.out.println(l);
        System.out.println(m);
        String s = "こんにちは";
        System.out.println(s);
        String s1 = "世界";
        String s2 = s + s1;
        System.out.println(s + s1);
        System.out.println(s2);
        Scanner in = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String name = in.nextLine();
        System.out.println("こんにちは、" + name + "さん！");
        in.close();
    }

}
