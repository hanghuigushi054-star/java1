import java.util.Scanner;
public class day06 {
    public static void main(String[] args) {
        int score;
        Scanner in = new Scanner(System.in);
        System.out.print("点数を入力してください (1-5): ");
        score = in.nextInt();
        switch (score) {
case 1:
System.out.println("もっと頑張りましょう");
break;
case 2:
System.out.println("もう少し頑張りましょう");
break;
case 3:
System.out.println("普通です");
break;
case 4:
System.out.println("よくできました");
break;
case 5:
System.out.println("大変よくできました");
break;
default:
System.out.println("想定されていない点数です");
}
System.out.println("switchブロックを抜けました");
switch (score) {
case 1:
case 2:
System.out.println("もっと頑張りましょう");
break;
case 3:
case 4:
case 5:
System.out.println("合格です");
break;
default:
System.out.println("想定されていない点数です");
}
int i;
/// Scanner in = new Scanner(System.in) の部分が重複しているため、コメントアウトしています。
        Scanner in = new Scanner(System.in);
        System.out.print("点数を入力してください (1-5): ");
        i = in.nextInt();
switch(i) {
case 1:
System.out.println("A");
case 2:
break;
case 3:
System.out.println("B");
case 4:
default:
System.out.println("C");
}
    }
}