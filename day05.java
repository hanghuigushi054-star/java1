public class day05 {
    public static void main(String[] args){
        int age;
        age = 21;
        if(age < 20){
        System.out.println("未成年です");
    } else {
        System.out.println("投票に行きましょう");
    }
    int toshi;
    toshi = 21;
    if(toshi < 5){
        System.out.println("入場料は無料です");
    } else if(toshi < 13){
        System.out.println("子供料金で入場できます");
    } else if(toshi > 20){
        System.out.println("大人料金が必要です");
    }
    int a;
    a = 67;
    if(a < 5) {
System.out.println("A");
} else if(a < 9) {
System.out.println("B");
} else if(a < 15) {
System.out.println("C");
} else {
System.out.println("D");
}
int to;
to = 21;
if(to >= 20)
System.out.println("二十歳以上ですね");
System.out.println("お酒をお飲みになれます");
}
}
