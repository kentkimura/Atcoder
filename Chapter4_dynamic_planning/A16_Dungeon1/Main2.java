import java.util.Scanner;

public class Main2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N + 1]; // 部屋 i - 1から部屋 i への移動時間
        int[] B = new int[N + 1]; // 部屋 i - 2から部屋 i への移動時間

        for(int i = 2; i <= N; i++){
            A[i] = scanner.nextInt();
        }

        for(int i = 3; i <= N; i++){
            B[i] = scanner.nextInt();
        }

        // dp[i]:部屋iに到達するための最短時間
        int[] dp = new int[N + 1];
        dp[1] = 0; // 部屋1にいるので移動時間は0
        dp[2] = A[2]; // 部屋1から部屋2への移動時間

        for(int i = 3; i <= N; i++){
            dp[i] = Math.min(dp[i - 1] + A[i], dp[i - 2] + B[i]);
        }

        // 部屋 N への最短時間を出力
        System.out.println(dp[N]);
        
        scanner.close();
    }
}