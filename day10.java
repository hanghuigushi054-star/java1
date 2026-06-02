public class day10 {
    public static void main(String[] args) {
        for( int x = 0; x <= 2; x++) {
            int result = (x * x) - (2 * x) + 1;
        System.out.println(result);
        }
        int i = 0;
        while (i <5) {
            System.out.println("こんにちは");
            i++;
        }
        int j = 5;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
        int k = 0;
do {
System.out.println("こんにちは");
k++;
} while(k < 3);
int sum = 0;
for(int l = 1; l <= 10; l++) {
sum += l;
System.out.println(l + "を加えました");
if(sum > 10) {
System.out.println("合計が10を超えた");
break;
}
}
System.out.println("合計は" + sum );
int sum1 = 0;
for(int m = 1; m <= 10; m++) {
if(m % 3 == 0) {
continue;
}
sum1 += m;
System.out.println(m + "を加えました");
}
System.out.println("合計は" + sum1 );
for(int a = 1; a <= 3; a++) {
System.out.println("a = "+ a);
for(int b = 1; b <= 3; b++) {
System.out.println("b = "+ b); 
}
}
for(int p = 1; p <= 9; p++) {
for(int q = 1; q <= 9; q++) {
System.out.print(p + "×" + q + "=" + (p * q) + " ");
}
System.out.println();
}
int[] scores;
scores = new int[5];
scores[0] = 29;
scores[1] = 55;
scores[2] = 70;
scores[3] = 65;
scores[4] = 80;
for(int f = 0; f < 5; f++) {
System.out.println(scores[f]);
}
int n = scores.length;
System.out.println("配列の要素数は" + n);
    }
}