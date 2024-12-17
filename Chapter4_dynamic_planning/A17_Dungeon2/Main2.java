import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2{
    public static void main(String[] args){
        Scanenr scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N + 1];

        for(int i = 2; i <= N; i++){
            A[i] = scanner.nextInt();
        }

        for(int i = 3; i <= N; i++){
            B[i] = scanner.nextInt();
        }

        // DP配列の初期化
        int[] dp = new int[N + 1];
        dp[1] = 0;
        dp[2] = A[2];

        // DPの遷移
        for(int i = 3; i <= N; i++){
            dp[i] = Math.min(dp[i - 1] + A[i], dp[i - 2] + B[i]);
        }

        // 経路復元
        List<Integer> path = new ArrayList<Integer>();
        int i = N;
        while(i > 0){
            path.add(i);
            if(i >= 2 && dp[i] == dp[i - 1] + A[i]){
                i -= 1;
            }else{
                i -= 2;
            }
        }

        // 結果出力
        System.out.println(path.size());
        for(int j = path.size() - 1; j >= 0; j--){
            System.out.print(path.get(j) + " ");
        }
    }
}