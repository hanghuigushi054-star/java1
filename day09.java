public class day09 {
    public static void main(String[] args) {
    //前回の訂正
    boolean x,y,z;
    x = true;
    y = false;
    z = true;
    System.out.println(x && (y || z));
    System.out.println((x && y) || z);
    //x~zをint型で定義していたからboolean型で定義し直す必要があった。
    for(int a = 0; a < 5; a++) {
    System.out.println("こんにちは");
    }
    //ひとつの作業ごとに{}で括る必要がある。
    int sum = 0; {
for(int i = 1; i <= 10; i++) {
sum += i;
System.out.println(i + "を加えました");
}
    }
System.out.println("合計は" + sum );
    int sum1 = 0;
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) { 
        sum1 += i;
}
}
//System.out.println("1の答え: " + sum1); をfor文の外に出すことで答えだけを表示することができる。
System.out.println("1の答え: " + sum1);
 int sum2 = 0;
for (int i = 1; i <= 10; i++) {
    if ((i % 2 == 0 || i % 3 == 0) && i % 12 != 0) {
        sum2 += i;
}
}
System.out.println("2の答え: " + sum2);
}
}