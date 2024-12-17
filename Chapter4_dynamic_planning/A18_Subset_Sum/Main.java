import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scannre scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        // DP配列を初期化
        boolean[] dp = new boolean[S + 1];
        dp[0] = true; // 0の合計は常に達成可能

        // 各カードを処理
        for(int i = 0; i < N; i++){
            for(int j = S; j >= A[i]; j--){
                if(dp[j - A[i]]){
                    dp[j] = true;
                }
            }
        }
        // 合計がSになるかどうか
        System.out.println(dp[S] ? "Yes" : "No");
    }
}