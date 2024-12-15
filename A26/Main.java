import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 質問の数を読み込む
        int Q = scanner.nextInt();
        int[] results = new int[Q];

        // 各整数が素数かどうかをチェック
        for(int i = 0; i < Q; i++){
            int X = scanner.nextInt();
            results[i] = isPrime(X) ? 1 : 0;
        }

        // 結果を出力
        for(int result : results){
            System.out.println(result == 1 ? "Yes" : "No");
        }

        scanner.close();
    }

    // 素数判定のメソッド
    private static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}