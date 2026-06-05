import java.util.Scanner;
public class day12 {

    public static void countdown(int start){
        System.out.println("カウントダウンをします");
        for(int i = start; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static void countdown(int start, int end){
        System.out.println("カウントダウンをします");
        for(int i = start; i >= end; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String[] names = (args.length > 0) ? args : new String[]{"apple", "banana", "cherry"};
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("整数を入力してください。");
        int i = in.nextInt();
        System.out.println(i + "が入力されました。");
        
        countdown(3);
        countdown(10);
        countdown(7,2);
    }
}
